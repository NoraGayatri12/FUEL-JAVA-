package src;
import java.sql.*;

public class InsertData {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/solapur";
        String user = "root";
        String password = "sweety@12";

        Connection con = DriverManager.getConnection(url, user, password);

        System.out.println("Connected to database...");

        Statement stmt = con.createStatement();

        

        System.out.println("Record inserted successfully...");
        String q1 = "INSERT INTO student VALUES (1, 'Pranita', 20)";
        String q2 = "INSERT INTO student VALUES (2, 'Vaishu', 21)";
        String q3 = "INSERT INTO student VALUES (3, 'Teju', 22)";

        stmt.addBatch(q1);
        stmt.addBatch(q2);
        stmt.addBatch(q3);
        stmt.executeBatch();
        
        System.out.println("Multiple values inserted....");

        stmt.close();
        con.close();
    }
}