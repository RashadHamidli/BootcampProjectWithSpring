package com.company.spring.example;

public class BMessage implements IMessage {
    @Override
    public void print() {
        System.out.println(getClass().getSimpleName());
    }
}
