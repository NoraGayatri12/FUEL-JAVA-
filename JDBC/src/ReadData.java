package src;

import java.sql.*;

public class ReadData {
    public static void main(String args[]) throws Exception {

        String url = "jdbc:mysql://localhost:3306/solapur";
        String user = "root";
        String password = "sweety@12";

        Connection con = DriverManager.getConnection(url, user, password);

        Statement stmt = con.createStatement();
        String query = "SELECT * FROM student";

        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println(
                rs.getInt("rollNo") + " " +
                rs.getString("name") + " " +
                rs.getInt("age")
            );
        }

        rs.close();
        stmt.close();
        con.close();
    }
}