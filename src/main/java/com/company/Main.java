package com.company;

import com.company.dao.UserDAO;
import com.company.entity.User;
import com.company.service.UserService;

public class Main {
    private final UserService userService;

    public Main(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        User user=new User();
    }


}
