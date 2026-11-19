package com.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.StudentDAO;

@WebServlet("/deleteStudent")
public class DeleteStudentServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public DeleteStudentServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        StudentDAO dao = new StudentDAO();

        boolean status = dao.deleteStudent(id);

        if (status) {
            response.sendRedirect("viewStudent");
        } else {
            response.getWriter().println("<h2>Student Record Delete Failed!</h2>");
        }
    }
}