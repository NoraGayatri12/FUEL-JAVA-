package com.example.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");

        res.setContentType("text/html");

        if (name != null && !name.isEmpty()) {
            res.getWriter().println("<h2>Login Successful</h2>");
            res.getWriter().println("Welcome " + name);
        } else {
            res.getWriter().println("<h2>Login Failed</h2>");
        }
    }
}