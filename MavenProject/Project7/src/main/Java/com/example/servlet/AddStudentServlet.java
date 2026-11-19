package com.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.StudentDAO;
import com.example.model.Student;

@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public AddStudentServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Read Form Data
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String city = request.getParameter("city");

        // Create Student Object
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setCity(city);

        // Save Student
        StudentDAO dao = new StudentDAO();
        boolean status = dao.saveStudent(student);

        if (status) {
            response.sendRedirect("viewStudent");
        } else {
            request.setAttribute("message", "Student Registration Failed!");

            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }
}