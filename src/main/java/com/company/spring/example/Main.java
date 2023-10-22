package com.company.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        IMessage aMessage = context.getBean("messageA", IMessage.class);
        aMessage.print();

    }
}
