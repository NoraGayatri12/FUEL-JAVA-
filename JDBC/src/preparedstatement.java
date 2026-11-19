package src;
import java.sql.*;

class preparedStatement {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/solapur";
        String user = "root";
        String password = "sweety@12";

        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to database...");

        String q = "INSERT INTO student VALUES (?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(q);

        // Batch 1
        ps.setInt(1, 301);
        ps.setString(2, "Prajwal");
        ps.setInt(3, 28);
        ps.addBatch();

        // Batch 2
        ps.setInt(1, 302);
        ps.setString(2, "Onkar");
        ps.setInt(3, 26);
        ps.addBatch();

        // Batch 3
        ps.setInt(1, 303);
        ps.setString(2, "Abhi");
        ps.setInt(3, 23);
        ps.addBatch();

        // Execute batch
        ps.executeBatch();

        System.out.println("Multiple values inserted successfully!");

        ps.close();
        con.close();
    }
}