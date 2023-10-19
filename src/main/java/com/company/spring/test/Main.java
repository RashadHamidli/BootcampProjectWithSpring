package com.company.spring.test;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        A a = new A(b);
        a.run();
    }
}
