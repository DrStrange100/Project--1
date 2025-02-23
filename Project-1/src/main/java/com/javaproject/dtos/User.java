package com.javaproject.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@ToString
//@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    private String name;
    private String email;
    private String pass;
    private Integer id;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

    public User (String name, String email, String pass, Integer id) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
    }

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
}
