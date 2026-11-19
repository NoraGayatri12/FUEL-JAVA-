package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Student s1 = new Student("Gayatri", 98);
        Student s2 = new Student("Vaishanavi", 97);

        session.persist(s1);
        session.persist(s2);

        tx.commit();

        session.close();
        factory.close();

        System.out.println("Data Inserted Successfully");
    }
}