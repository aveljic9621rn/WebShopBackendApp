package com.example.webshopbackend.service;

import com.example.webshopbackend.dto.CreateUserDTO;
import com.example.webshopbackend.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDTO> getAllUsers();
    UserDTO addUser(CreateUserDTO createUserDTO);
    UserDTO updateUser(UserDTO userDTO);
}
