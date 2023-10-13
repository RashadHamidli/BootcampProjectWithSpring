package com.company.entity;

public class User {
    private static Student s = new Student(1, "Rashad", "Hamidli");
    private static Teacher t = new Teacher(1, "Ehmen", "Memmedov");

    public static void main(String[] args) {
        System.out.println(t);
        System.err.println(s);

//        System.out.println(s);
//        String surname = s.surname();
//        long id = s.id();
//        String name = s.name();
//        System.out.println(id);
//        System.out.println(name);
//        System.out.println(surname);
    }

}
