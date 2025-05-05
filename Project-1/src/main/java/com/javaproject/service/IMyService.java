package com.javaproject.service;

import com.javaproject.dtos.User;

import java.util.List;

public interface IMyService {

    void createUser(User user);

    List<User> getAllUser();

    User getUserById(Integer id);
}
