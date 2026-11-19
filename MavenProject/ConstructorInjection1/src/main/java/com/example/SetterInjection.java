package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class MessageService2 {
    public String getMessage2() {
        return "It is Example of Setter Dependency Injection";
    }
}

@Component
public class SetterInjection {

    private MessageService2 msg;   // declare variable

    // Setter Injection
    @Autowired
    public void setMessageService2(MessageService2 msg) {
        this.msg = msg;
    }

    // single method
    public void display() {
        System.out.println("Welcome To Setter Injection");
        System.out.println(msg.getMessage2());
    }
}