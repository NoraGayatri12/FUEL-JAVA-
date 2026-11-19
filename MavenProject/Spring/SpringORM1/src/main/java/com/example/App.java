package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.hibernate.SessionFactory;

public class App {
    public static void main(String[] args) {

        // Correct context creation
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Get SessionFactory bean
        SessionFactory sf = context.getBean(SessionFactory.class);

        System.out.println("SessionFactory created successfully!");

        context.close();
    }
}