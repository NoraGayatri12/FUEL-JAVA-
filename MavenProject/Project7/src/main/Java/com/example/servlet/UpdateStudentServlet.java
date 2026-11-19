package com.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.StudentDAO;
import com.example.model.Student;

@WebServlet("/updateStudent")
public class UpdateStudentServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public UpdateStudentServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String city = request.getParameter("city");

        Student student = new Student();

        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setCity(city);

        StudentDAO dao = new StudentDAO();

        boolean status = dao.updateStudent(student);

        if (status) {
            response.sendRedirect("viewStudent");
        } else {
            response.getWriter().println("<h2>Student Record Update Failed!</h2>");
        }
    }
}