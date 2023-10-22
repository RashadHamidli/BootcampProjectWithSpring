package com.company;


import com.company.spring.example.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("aaaaaa");
//        IMessage aMessage = context.getBean("messageA", IMessage.class);
//        aMessage.print();
//        IMessage bMessage = context.getBean("messageB", IMessage.class);
//        bMessage.print();

    }
}
