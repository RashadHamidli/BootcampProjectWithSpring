package com.company.spring.test;

public class A {
    private final IRun iRun;

    public A(IRun iRun) {
        this.iRun = iRun;
    }

    public void run() {
        iRun.print();
    }
}
