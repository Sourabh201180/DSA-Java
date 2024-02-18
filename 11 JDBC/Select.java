import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_db?user=root&password=1523");

            String query = "select * from products";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                System.out.println(rs.getInt(1) + " - " + rs.getString("name") + " - " + rs.getInt(3) + " - " + rs.getInt(4));
            }

            con.close();
        } catch(ClassNotFoundException|SQLException e) {
            e.printStackTrace();
        }
    }
}