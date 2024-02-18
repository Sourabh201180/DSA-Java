import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Update {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_db?user=root&password=1523");

            String query = "update products set name=?, price=? where product_id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "boat 141");
            ps.setInt(2, 1199);
            ps.setInt(3, 13);

            ps.executeUpdate();

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}