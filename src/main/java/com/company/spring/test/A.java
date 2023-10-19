package com.company.spring.test;

public class A {
    private final B b;

    public A(B b) {
        this.b = b;
    }

    public void run() {
        b.print();
    }
}
