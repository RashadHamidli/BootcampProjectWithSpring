package com.company.spring.test;

public class A {
    private B b;
    private C c;

    public A() {
        b = new B();
        c = new C();
    }

    public void run() {
        b.print();
        c.print();
    }
}
