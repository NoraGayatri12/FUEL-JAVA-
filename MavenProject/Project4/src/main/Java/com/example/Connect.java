package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

    public static Connection getConnection() {

        Connection con = null;

        try {

            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/FULLStackJava";
            String user = "root";
            String password = "sweety@12";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("Database Connected Successfully!");

        } catch (Exception e) {

            System.out.println("Database Connection Failed!");
            e.printStackTrace();

        }

        return con;
    }
}