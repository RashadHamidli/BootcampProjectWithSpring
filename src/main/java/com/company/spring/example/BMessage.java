package com.company.spring.example;

import org.springframework.stereotype.Component;

@Component
public class BMessage implements IMessage {
    @Override
    public void print() {
        System.out.println(getClass().getSimpleName());
    }
}
