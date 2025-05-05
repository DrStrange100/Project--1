package com.javaproject.controller;

import com.javaproject.constant.ApplicationConstant;
import com.javaproject.constant.RestConstant;
import com.javaproject.dtos.User;
import com.javaproject.service.IMyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project_1")
public class Controller {

    @Autowired
    private IMyService myservice;

    @PostMapping(RestConstant.USER_DETAILS)
    public ResponseEntity<String> createUser(@RequestBody User user) {
        myservice.createUser(user);
        return ResponseEntity.ok().body(ApplicationConstant.SUCCESS);
    }

    @GetMapping(RestConstant.GET_USER_DETAILS)
    public ResponseEntity<List<User>> getUserDetails() {
        List<User> user = myservice.getUser();
        return ResponseEntity.ok().body(user);
    }

}
