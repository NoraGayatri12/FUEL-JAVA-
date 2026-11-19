package com.example;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        JdbcTemplate temp = context.getBean(JdbcTemplate.class);

        // temp.execute("CREATE DATABASE SpringDB");  //To create Database

        temp.execute("USE SpringDB");   //To use SpringDB database to do operations 

        // String query = "CREATE TABLE Bank (" +
        //                    "account_no INT PRIMARY KEY," +
        //                    "name VARCHAR(50)," +
        //                    "balance DOUBLE," +
        //                    "account_type VARCHAR(20))";
        //  temp.execute(query); //Execute query

        //Insert Data into column
        // String insertQuery = "INSERT INTO Bank (account_no, name, balance, account_type) VALUES (?, ?, ?, ?)";//Insert data
        // temp.update(insertQuery, 101, "Sweety", 500000.0, "Savings");

        // String insertQuery = "INSERT INTO Bank (account_no, name, balance, account_type) VALUES (?, ?, ?, ?)";//Insert data
        // temp.update(insertQuery, 102, "Vaishanavi", 400000.0, "Savings");
        
        
        
        String selectQuery = "SELECT * FROM Bank";//To do Select Operation

        List<Map<String, Object>> rows = temp.queryForList(selectQuery);

        for (Map<String, Object> row : rows) {
            System.out.println(
                    row.get("account_no") + " | " +
                    row.get("name") + " | " +
                    row.get("balance") + " | " +
                    row.get("account_type")
            );
        }

        //  System.out.println("Database created successfully");
        // System.out.println("Table created successfully");
        // System.out.println("Data Inserted Successfully");
         System.out.println("Rows In Bank Table Successfully");
        
        context.close();
    }
}