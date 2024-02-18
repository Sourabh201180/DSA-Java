import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Delete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_db?user=root&password=1523");

            String query = "delete from products where product_id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 12);

            ps.executeUpdate();

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}