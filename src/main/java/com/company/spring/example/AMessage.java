package com.company.spring.example;

import org.springframework.stereotype.Component;

@Component
public class AMessage implements IMessage{
    @Override
    public void print() {
        System.out.println(getClass().getSimpleName());
    }
}
