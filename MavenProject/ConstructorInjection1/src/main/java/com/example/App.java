package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(App.class);//create class context to remove dependancy
       ConstructorInjection bean=context.getBean(ConstructorInjection.class);//for ConstructorInjection
       bean.show();
       SetterInjection bean2=context.getBean(SetterInjection.class);//for SetterInjection
       bean2.display();
    }
}
