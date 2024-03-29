package com.company.spring.controller;

import com.company.spring.entity.Users;
import com.company.spring.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
    private static final UserService userService = new UserService();

    @GetMapping("/{id}")
    public static String doGet(long id) {
        Users user = userService.getUser(id);
        String st = user.toString();
        return st;
    }

    @PostMapping("/add")
    public static String doAdd(Users users) {
        userService.addUser(users);
        return "Users added";
    }

    @GetMapping("/delete/{id}")
    public static String doDelete(int id) {
        userService.deleteUser(id);
        return "Users deleted";
    }

    @PostMapping("/update/{id}")
    public static String doUpdate(int id, Users users) {
        userService.updateUser(id, users);
        return "Users updated";
    }

}
