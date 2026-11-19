package src;

import java.sql.*;
public class connections {
    public static void main(String arg[])throws SQLException{
        String url="jdbc:mysql://localhost:3306";
        String user="root";
        String password="sweety@12";
        Connection con=DriverManager.getConnection(url,user,password);
        System.out.println("connected to database...");
        Statement stmt=con.createStatement();
        stmt.executeUpdate("Create DATABASE solapur2");
        stmt.close();
        con.close();
        System.out.println("Database created....");

    }
}
