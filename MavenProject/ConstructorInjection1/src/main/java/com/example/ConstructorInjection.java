package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Component class MessageService{
    public String getMessage(){

        return "It is Example of Constructor Injection Dependancy";
        
    }
}

@Component
public class ConstructorInjection{
    private MessageService msg;
    // Constructor Injection
    public ConstructorInjection(MessageService msg){
        this.msg=msg;
    }

    void show(){     
    System.out.println("Welcome To Constructor Injection"); 
    System.out.println(msg.getMessage());
    }
}
