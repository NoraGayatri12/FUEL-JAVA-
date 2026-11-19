package com.example.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.StudentDAO;
import com.example.model.Student;

@WebServlet("/editStudent")
public class EditStudentServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public EditStudentServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        StudentDAO dao = new StudentDAO();

        Student student = dao.getStudentById(id);

        request.setAttribute("student", student);

        RequestDispatcher dispatcher = request.getRequestDispatcher("editStudent.jsp");
        dispatcher.forward(request, response);
    }
}