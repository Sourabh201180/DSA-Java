import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

class A {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_db?user=root&password=1523");

            String query = "select * from products";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                System.out.println(rs.getInt(1) + rs.getString("name"));
            }

            con.close();
        } catch(ClassNotFoundException|SQLException e) {
            e.printStackTrace();
        }
    }
}