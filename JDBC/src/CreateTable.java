package src;
import java.sql.*;
public class CreateTable {
    public static void main(String arg[])throws SQLException{
        String url="jdbc:mysql://localhost:3306/solapur";
        String user="root";
        String password="sweety@12";
        Connection con=DriverManager.getConnection(url,user,password);
        System.out.println("connected to database...");
        Statement stmt=con.createStatement();
       String q = "CREATE TABLE student (rollNo INTEGER, name VARCHAR(15), age INTEGER)";

        stmt.executeUpdate(q);
        stmt.close();
        con.close();
        System.out.println("Table created....");

    }
}