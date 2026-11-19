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
       Hello bean=context.getBean(Hello.class);
       FieldInjection bean2=context.getBean(FieldInjection.class);
       bean.display();
       bean2.show();
    }
}
