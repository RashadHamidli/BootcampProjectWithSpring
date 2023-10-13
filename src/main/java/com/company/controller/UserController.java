package com.company.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class UserController {


    @GetMapping("/1")
    protected String doGet() {
        return "Hello World doGet";
    }

    @RequestMapping("/2")
    protected String doReq() {
        return "Hello World doReq bbb";
    }

}
