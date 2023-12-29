package com.example.picasso.model.dto.auth;

import lombok.Getter;

@Getter
public class CreateUserRequestDTO {
    private String firstName;
    private String secondName;
    private String email;
    private String password;
}
