package com.javaproject.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    private String name;
    private String email;
    private String pass;
    private Integer id;

}
