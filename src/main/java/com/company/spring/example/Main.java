package com.company.spring.example;

import org.apache.naming.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Message message = context.getBean("message", Message.class);
        Message message1 = context.getBean("message1", Message.class);

        System.out.println(context.isPrototype("message"));

        System.out.println(context.isSingleton("message1"));

        System.out.println(context.getBeanDefinitionCount());
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
