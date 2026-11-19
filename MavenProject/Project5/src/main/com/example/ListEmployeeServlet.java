package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListEmployeeServlet")
public class ListEmployeeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {

            Connection con = Connect.getConnection();

            String sql = "SELECT * FROM `Employee Management System`";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Employee List</title>");

            out.println("<style>");
            out.println("body{font-family:Arial;background:#eef2f7;padding:40px;}");
            out.println("h2{text-align:center;color:#0d6efd;}");
            out.println("table{width:70%;margin:auto;border-collapse:collapse;background:white;}");
            out.println("th,td{border:1px solid #ddd;padding:12px;text-align:center;}");
            out.println("th{background:#0d6efd;color:white;}");
            out.println("tr:nth-child(even){background:#f2f2f2;}");
            out.println("a{text-decoration:none;font-weight:bold;color:#0d6efd;}");
            out.println("</style>");

            out.println("</head>");
            out.println("<body>");

            out.println("<h2>Employee List</h2>");

            out.println("<table>");
            out.println("<tr>");
            out.println("<th>ID</th>");
            out.println("<th>Name</th>");
            out.println("<th>Salary</th>");
            out.println("</tr>");

            while(rs.next()){

                out.println("<tr>");
                out.println("<td>"+rs.getInt("Id")+"</td>");
                out.println("<td>"+rs.getString("Name")+"</td>");
                out.println("<td>"+rs.getInt("Salary")+"</td>");
                out.println("</tr>");

            }

            out.println("</table>");

            out.println("<br><center>");
            out.println("<a href='index.jsp'>Back to Home</a>");
            out.println("</center>");

            out.println("</body>");
            out.println("</html>");

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}