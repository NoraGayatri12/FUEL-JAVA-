package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "sweety@12";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            String sql = "CREATE DATABASE solapur";

            stmt.executeUpdate(sql);

            System.out.println("Database Created Successfully!");

            stmt.close();
            con.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}