package com.example;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/add")
public class AddEmployeeServlet extends HttpServlet {

    // ✅ For browser testing (GET request)
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
        res.setContentType("text/html");
        res.getWriter().println("<h2>Servlet is working! Use form to add employee.</h2>");
    }

    // ✅ For form submission (POST request)
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        res.setContentType("text/html");

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        double salary = Double.parseDouble(req.getParameter("salary"));

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO employee(id, name, salary) VALUES(?,?,?)"
            );

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, salary);

            int i = ps.executeUpdate();

            if (i > 0) {
                res.getWriter().println("<h3>Employee Added Successfully ✅</h3>");
            } else {
                res.getWriter().println("<h3>Failed to Add Employee ❌</h3>");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            res.getWriter().println("<h3>Error: " + e.getMessage() + "</h3>");
        }
    }
}