package com.learning.springbootobservability.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String getUser() {
        return "Ankit Shah";
    }

    @PostMapping
    public String addUser() {
        return "New user is added.";
    }

    @DeleteMapping
    public String deleteUser() {
        return "User is deleted";
    }
}
