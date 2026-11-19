package com.example.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.StudentDAO;
import com.example.model.Student;

@WebServlet("/viewStudent")
public class ViewStudentServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ViewStudentServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Create DAO Object
        StudentDAO dao = new StudentDAO();

        // Fetch Student List
        List<Student> studentList = dao.getAllStudents();

        // Send List to JSP
        request.setAttribute("studentList", studentList);

        // Forward to students.jsp
        RequestDispatcher rd = request.getRequestDispatcher("students.jsp");
        rd.forward(request, response);
    }
}