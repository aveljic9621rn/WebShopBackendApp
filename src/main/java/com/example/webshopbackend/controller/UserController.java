package com.example.webshopbackend.controller;

import com.example.webshopbackend.dto.CreateUserDTO;
import com.example.webshopbackend.dto.UserDTO;
import com.example.webshopbackend.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {

    UserService userService;
    @PostMapping("/user/add")
    public ResponseEntity<UserDTO> addUser(@RequestHeader("Authorization") String authorization, @RequestBody CreateUserDTO createUserDTO) {
        return new ResponseEntity<>(userService.addUser(createUserDTO), HttpStatus.OK);
    }
    @PostMapping("/user/update")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(userService.updateUser(userDTO), HttpStatus.OK);
    }

}



