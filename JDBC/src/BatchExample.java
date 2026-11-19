package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/solapur";
        String user = "root";
        String password = "sweety@12";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            stmt.addBatch("INSERT INTO student VALUES(201,'Gayatri',21)");
            stmt.addBatch("INSERT INTO student VALUES(202,'Divya',20)");
            stmt.addBatch("INSERT INTO student VALUES(203,'Sanjana',22)");

            int[] result = stmt.executeBatch();

            System.out.println("Batch executed successfully.");

            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}