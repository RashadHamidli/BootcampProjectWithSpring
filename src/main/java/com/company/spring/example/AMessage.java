package com.company.spring.example;

public class AMessage implements IMessage{
    @Override
    public void print() {
        System.out.println(getClass().getSimpleName());
    }
}
