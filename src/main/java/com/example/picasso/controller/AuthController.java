package com.example.picasso.controller;


import com.example.picasso.model.dto.auth.CreateUserRequestDTO;
import com.example.picasso.model.dto.common.CommonResponseDTO;
import com.example.picasso.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthService authService;
    @PostMapping("/users")
    public ResponseEntity<CommonResponseDTO> createUser(@RequestBody final CreateUserRequestDTO body){
        authService.createUser(body);

        CommonResponseDTO responseDTO = new CommonResponseDTO("user created successfully",201 );
        ResponseEntity<CommonResponseDTO> response = new ResponseEntity<CommonResponseDTO>(responseDTO, HttpStatusCode.valueOf(201));
        return response;
    }

    /**
     * TODO
     *
     * Create Login route handler function
     * API Details:
     *      [POST] /auth/users/login
     *      body: {
     *          "email": "riyas@email.com",
     *          "password": "password"
     *      }
     *
     * Use the AuthService to check if the user exists in DB
     * If the user does not exists, throw UserNotFoundException
     * Create a JWT Token for the user
     * return the response with the JWT Token
     */

    @GetMapping("/authenticated")
    public  ResponseEntity<CommonResponseDTO> authenticated() {
        System.out.println("in authenticated method of AuthController");

        CommonResponseDTO responseDTO = new CommonResponseDTO("Successfull authentication",200 );
        ResponseEntity<CommonResponseDTO> response = new ResponseEntity<CommonResponseDTO>(responseDTO, HttpStatusCode.valueOf(201));
        return response;
    }



}
