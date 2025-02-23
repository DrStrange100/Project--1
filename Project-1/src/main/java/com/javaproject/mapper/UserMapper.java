package com.javaproject.mapper;

import com.javaproject.dtos.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    void createUser(User user);

    List<User> getUser();
}
