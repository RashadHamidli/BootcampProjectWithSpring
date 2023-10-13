package com.company.controller;

import com.company.entity.User;
import com.company.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    protected String doGet() {
        return "User get";
    }

    @PostMapping("/add")
    protected String doAdd() {
        User user=new User("Rashad", "Hamidli", "mr_rashad@email.com");
        userService.addUser(user);
        return "User added";
    }

    @GetMapping("/delete/{id}")
    protected String doDelete() {
        return "User deleted";
    }

    @PostMapping("/update/{id}")
    protected String doUpdate() {
        return "User updated";
    }

}
