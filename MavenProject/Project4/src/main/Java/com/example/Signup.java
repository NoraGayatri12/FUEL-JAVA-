package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/signup")
public class Signup extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");

        try {

            Connection con = Connect.getConnection();

            String query = "INSERT INTO user(username,password) VALUES(?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            String username = req.getParameter("username");
            String password = req.getParameter("password");

            ps.setString(1, username);
            ps.setString(2, password);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                pw.println("<h2>Signup Successful</h2>");
                pw.println("<a href='login.jsp'><button>Login</button></a>");
            } else {
                pw.println("<h2>Signup Failed</h2>");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            pw.println(e.getMessage());
        }
    }
}