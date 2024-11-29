import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdb {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection c = DriverManager.getConnection("jdbc:mysql:// localhost:3306/student", "root", "1234")) {

            Statement st = c.createStatement();
            System.out.println("successfull");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("failed");
        }

    }
}