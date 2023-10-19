package com.company.spring.test;

public class A {
    private B b;
    public A(){
        b=new B();
    }
    public void run(){
        b.print();
    }
}
