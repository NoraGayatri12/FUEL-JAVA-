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

@WebServlet("/SearchEmployeeServlet")
public class SearchEmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {

            int id = Integer.parseInt(request.getParameter("id"));

            Connection con = Connect.getConnection();

            String sql = "SELECT * FROM `Employee Management System` WHERE Id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                out.println("<html><body style='font-family:Arial;'>");
                out.println("<h2>Employee Found</h2>");
                out.println("<table border='1' cellpadding='10'>");
                out.println("<tr><th>ID</th><th>Name</th><th>Salary</th></tr>");
                out.println("<tr>");
                out.println("<td>" + rs.getInt("Id") + "</td>");
                out.println("<td>" + rs.getString("Name") + "</td>");
                out.println("<td>" + rs.getInt("Salary") + "</td>");
                out.println("</tr>");
                out.println("</table><br>");
                out.println("<a href='index.jsp'>Back to Home</a>");
                out.println("</body></html>");

            } else {

                out.println("<h2 style='color:red;'>Employee Not Found!</h2>");
                out.println("<a href='searchEmployee.jsp'>Try Again</a>");

            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}