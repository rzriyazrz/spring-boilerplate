package com.example.picasso.service;

import com.example.picasso.model.dto.auth.CreateUserRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class AuthSevice {
    public void createUser(CreateUserRequestDTO body){
        System.out.println("OK");
    }

}
