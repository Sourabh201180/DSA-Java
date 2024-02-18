import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Prac {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb?user=root&password=1523");

            String q1 = "insert into students (name, contact, email) value (?, ?, ?)";
            PreparedStatement ps1 = con.prepareStatement(q1);
            ps1.setString(1, "golu");
            ps1.setInt(2, 999999999);
            ps1.setString(3, "golu@gmail.com");
            ps1.executeUpdate();

            String q2 = "select * from students where student_id = ?";
            PreparedStatement ps2 = con.prepareStatement(q2);
            ps2.setInt(1, 1);
            ResultSet rs = ps2.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getString(1) + " - " + rs.getInt(2) + " - " + rs.getString("email"));
            }

            String q3 = "update students set name = ?, contact = ?, email = ? where student_id = ?";
            PreparedStatement ps3 = con.prepareStatement(q3);
            ps3.setString(1, "Bholu");
            ps3.setInt(2, 888888888);
            ps3.setString(3, "bholu@gmail.com");
            ps3.setInt(4, 1);

            String q4 = "delete * from students where student_id = ?";
            PreparedStatement ps4 = con.prepareStatement(q4);
            ps4.setInt(1, 1);

            con.close();
        } catch(ClassNotFoundException|SQLException e) {
            e.printStackTrace();
        }
    }
}