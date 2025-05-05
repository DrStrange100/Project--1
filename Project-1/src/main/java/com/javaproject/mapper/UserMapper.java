package com.javaproject.mapper;

import com.javaproject.dtos.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("insert into user(name,email,pass,id) values(#{name},#{email},#{pass},#{id})")
    void createUser(User user);

    @Select("select * from user")
    List<User> getUser();
}
