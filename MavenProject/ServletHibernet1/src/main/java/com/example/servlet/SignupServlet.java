package com.example.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

import com.example.dao.StudentDAO;
import com.example.model.Student;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        String u = req.getParameter("username");
        String p = req.getParameter("password");

        Student s = new Student(u, p);

        new StudentDAO().signup(s);

        res.sendRedirect("login.jsp");
    }
}