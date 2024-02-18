import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_db?user=root&password=1523");

            String query = "insert into products (name, quantity, price) value (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "apple watch");
            ps.setInt(2, 5);
            ps.setInt(3, 18000);

            int val = ps.executeUpdate();
            
            con.close();
        } catch(ClassNotFoundException|SQLException e) {
            e.printStackTrace();
        }
    }
}