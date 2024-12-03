package com.insightveda.spring_boot_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @GetMapping("/api/users")
    public String getUsers() {
        return "List of users";
    }

    @GetMapping("/api/users/details")
    public String getUserDetails() {
        return "Details of a specific user";
    }
}

