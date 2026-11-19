package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");

        try {

            Connection con = Connect.getConnection();

            String username = req.getParameter("username");
            String password = req.getParameter("password");

            String query = "SELECT * FROM user WHERE username=? AND password=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pw.println("<h2>Login Successful</h2>");
            } else {
                pw.println("<h2>Invalid Username or Password</h2>");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            pw.println(e.getMessage());
        }
    }
}