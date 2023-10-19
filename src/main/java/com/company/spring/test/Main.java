package com.company.spring.test;

public class Main {
    public static void main(String[] args) {
        IRun rb = new B();
        IRun rc = new C();
        A a = new A(rc);
        a.run();
    }
}
