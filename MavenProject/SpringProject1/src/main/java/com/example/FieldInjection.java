package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Component class MessageService{
    public String getMessage(){

        return "It is Example of Injection Dependancy";
        
    }
}

@Component
public class FieldInjection{
    @Autowired
    private MessageService msg;
    void show(){     
    System.out.println("Welcome To Field Injection"); 
    System.out.println(msg.getMessage());
    }
}
