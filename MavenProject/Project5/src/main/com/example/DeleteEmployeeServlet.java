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

@WebServlet("/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {

            int id = Integer.parseInt(request.getParameter("id"));

            Connection con = Connect.getConnection();

            String sql = "DELETE FROM `Employee Management System` WHERE Id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int result = ps.executeUpdate();

            if(result > 0){

                out.println("<h2 style='color:green;text-align:center;'>Employee Deleted Successfully!</h2>");
                out.println("<center><a href='index.jsp'>Back to Home</a></center>");

            }else{

                out.println("<h2 style='color:red;text-align:center;'>Employee ID Not Found!</h2>");
                out.println("<center><a href='deleteEmployee.jsp'>Try Again</a></center>");

            }

            ps.close();
            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}