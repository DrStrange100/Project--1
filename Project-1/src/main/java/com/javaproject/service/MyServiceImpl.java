package com.javaproject.service;

import com.javaproject.dtos.User;
import com.javaproject.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyServiceImpl implements IMyService{

    @Autowired
    UserMapper usermapper;

    @Override
    public void createUser(User user) {
        usermapper.createUser(user);
    }

    @Override
    public List<User> getAllUser() {
        return usermapper.getAllUser();
    }

    @Override
    public User getUserById(Integer id) {
        return usermapper.getUserById(id);
    }

    @Override
    public void deleteUserById(Integer id) {
        usermapper.deleteUserById(id);
    }
}
