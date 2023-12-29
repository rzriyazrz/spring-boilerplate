package com.example.picasso.controller;


import com.example.picasso.model.dto.auth.CreateUserRequestDTO;
import com.example.picasso.model.dto.common.CommonResponseDTO;
import com.example.picasso.service.AuthSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthSevice authSevice;
    @PostMapping("/users")
    public ResponseEntity<CommonResponseDTO> createUser(@RequestBody final CreateUserRequestDTO body){
        authSevice.createUser(body);

        CommonResponseDTO responseDTO = new CommonResponseDTO("user created successfully",201 );
        ResponseEntity<CommonResponseDTO> response = new ResponseEntity<CommonResponseDTO>(responseDTO, HttpStatusCode.valueOf(201));
        return response;
    }



}
