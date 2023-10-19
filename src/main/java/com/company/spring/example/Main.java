package com.company.spring.example;

import org.apache.naming.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        Message message = (Message) beanFactory.getBean("message");
//        Message message = beanFactory.getBean("message", Message.class);
//        Message message = beanFactory.getBean(Message.class);
        message.print();

    }
}
