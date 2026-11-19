package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection con = null;

    // Database Connection Method
    public static Connection getConnection() {

        try {

            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database URL
            String url = "jdbc:mysql://localhost:3306/solapur";

            // Database Username
            String username = "root";

            // Database Password
            String password = "sweety@12";

            // Create Connection
            con = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

}