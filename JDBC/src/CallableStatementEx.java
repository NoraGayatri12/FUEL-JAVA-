package src;

import java.sql.*;

public class CallableStatementEx{
    public static void main(String args[]) throws Exception {

        String url = "jdbc:mysql://localhost:3306/solapur";
        String user = "root";
        String password = "sweety@12";

        Connection con = DriverManager.getConnection(url, user, password);
        CallableStatement cs=con.prepareCall("call getstudent()");
        ResultSet rs=cs.executeQuery();
        System.out.println("rollno"+"name"+"age");
        while(rs.next()){
            System.out.println(rs.getInt("rollno")+" "+rs.getString("name")+" "+rs.getInt("age"));
            System.out.println();
        }
    }}