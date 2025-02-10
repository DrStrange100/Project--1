package com.javaproject.controller;

import com.javaproject.dtos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/project-1")
public class Controller {

    @Autowired
    private User user;

    @PostMapping("/userdetails")
    public ResponseEntity<String> createUser(@RequestBody User user) {

        return ResponseEntity.ok().body("SUCCESS");
    }

    @GetMapping("/getuserdetails")
    public ResponseEntity<User> getUserDetails() {

        return ResponseEntity.ok().body(user);
    }

}
