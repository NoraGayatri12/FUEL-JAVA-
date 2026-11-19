package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateSalaryServlet")
public class UpdateSalaryServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {

            int id = Integer.parseInt(request.getParameter("id"));
            int salary = Integer.parseInt(request.getParameter("salary"));

            Connection con = Connect.getConnection();

            String sql = "UPDATE `Employee Management System` SET Salary=? WHERE Id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, salary);
            ps.setInt(2, id);

            int result = ps.executeUpdate();

            if(result > 0){

                out.println("<h2 style='color:green;text-align:center;'>Salary Updated Successfully!</h2>");
                out.println("<center><a href='index.jsp'>Back to Home</a></center>");

            }else{

                out.println("<h2 style='color:red;text-align:center;'>Employee ID Not Found!</h2>");
                out.println("<center><a href='updateSalary.jsp'>Try Again</a></center>");

            }

            ps.close();
            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}