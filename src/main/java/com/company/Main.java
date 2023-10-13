package com.company;

import com.company.controller.UserController;
import com.company.entity.Users;

public class Main {
    public static void main(String[] args) {
//        Users users = new Users("Rashad", "Hamidli", "mr_rashad@email.com");
//        String s = UserController.doAdd(users);
//        System.out.println(s);

//        String s1 = UserController.doGet(1);
//        System.out.println(s1);

//        Users user = new Users("A", "A", "A@gmail.com");
//        String s = UserController.doUpdate(2, user);
//        System.out.println(s);

        String s = UserController.doDelete(3);
        System.out.println(s);


    }
}
