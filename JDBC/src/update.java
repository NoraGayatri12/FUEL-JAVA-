package src;

import java.sql.*;

public class update {
    public static void main(String args[]) throws Exception {

        String url = "jdbc:mysql://localhost:3306/solapur";
        String user = "root";
        String password = "sweety@12";

        Connection con = DriverManager.getConnection(url, user, password);

        Statement stmt = con.createStatement();
        
        String query = "Update student SET name='Sweety' WHERE rollno=1";
        int rows = stmt.executeUpdate(query);
        if(rows>0){
            System.out.println("Record update Sucessfully");
        }
        else{
            System.out.println("No Record");
        }


    
    }
}