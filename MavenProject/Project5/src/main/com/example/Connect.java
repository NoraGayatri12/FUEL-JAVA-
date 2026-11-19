package com.example;

import java.sql.*;

public class Connect {

    public static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/FULLStackJava";
            String username = "root";
            String password = "sweety@12";

            con = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}