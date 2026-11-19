package src;

import java.sql.*;

public class Delete {
    public static void main(String args[]) throws Exception {

        String url = "jdbc:mysql://localhost:3306/solapur";
        String user = "root";
        String password = "sweety@12";

        Connection con = DriverManager.getConnection(url, user, password);

        Statement stmt = con.createStatement();
        
        String query = "Delete FROM student where rollNo=203";
        int rows = stmt.executeUpdate(query);
        if(rows>0){
            System.out.println("Record delete Sucessfully");
        }
        else{
            System.out.println("No Record");
        }


    
    }
}