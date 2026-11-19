package com.example.servlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.Student;
import com.example.model.IDCard;
import com.example.util.HibernateUtil;

public class AddStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String cardNumber = req.getParameter("cardNumber");

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        // Create objects
        Student s = new Student();
        s.setName(name);

        IDCard card = new IDCard();
        card.setCardNumber(cardNumber);

        // Association
        s.setIdCard(card);

        session.save(s);

        tx.commit();
        session.close();

        res.getWriter().println("Student with ID Card Saved Successfully!");
    }
}