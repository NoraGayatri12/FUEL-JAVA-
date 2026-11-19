package com.example.dao;

import org.hibernate.*;
import org.hibernate.query.Query;

import com.example.model.Student;
import com.example.util.HibernateUtil;

public class StudentDAO {

    public void signup(Student s) {
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.persist(s);

        tx.commit();
        session.close();
    }

    public Student login(String u, String p) {
        Session session = HibernateUtil.getFactory().openSession();

        Query<Student> q = session.createQuery(
            "from Student where username=:u and password=:p", Student.class);

        q.setParameter("u", u);
        q.setParameter("p", p);

        Student s = q.uniqueResult();

        session.close();
        return s;
    }
}