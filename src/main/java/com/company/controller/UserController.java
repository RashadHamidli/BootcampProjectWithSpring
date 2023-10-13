package com.company.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("/{id}")
    protected String doGet() {
        return "Hello World doGet";
    }
    @GetMapping("/add")
    protected String doAdd() {
        return "Hello World doGet";
    }
    @GetMapping("/delete")
    protected String doDelete() {
        return "Hello World doGet";
    }
    @GetMapping("/update")
    protected String doUpdate() {
        return "Hello World doGet";
    }

}
