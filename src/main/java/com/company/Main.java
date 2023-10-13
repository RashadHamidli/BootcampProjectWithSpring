package com.company;

import com.company.controller.UserController;
import com.company.entity.Users;

public class Main {
    public static void main(String[] args) {
        Users users = new Users("Rashad", "Hamidli", "mr_rashad@email.com");
        UserController.doAdd(users);
    }
}
