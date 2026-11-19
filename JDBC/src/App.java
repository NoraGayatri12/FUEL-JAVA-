import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root";
        String password = "sweety@12";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected Successfully!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}