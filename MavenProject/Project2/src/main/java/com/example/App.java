package com.example;
import java.sql.*;

public class App 
{
    public static void main( String[] args )throws SQLException
    {
        String url="jdbc:mysql://localhost:3306";
        String user="root";
        String password="sweety@12";
        Connection con=DriverManager.getConnection(url,user,password);

        System.out.println("Connected To Database");
        Statement stmt=con.createStatement();
        stmt.executeUpdate("create database mvndb");
        stmt.close();
        System.out.println("Database Create Successfully");
    }
}
