package com.example.webshopbackend.mapper;

import com.example.webshopbackend.domain.User;
import com.example.webshopbackend.dto.CreateUserDTO;
import com.example.webshopbackend.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDTO userToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setName(user.getName());
        userDTO.setSurname(user.getSurname());
        userDTO.setPhoneNumber(user.getPhoneNumber());
        userDTO.setMail(user.getMail());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        return userDTO;
    }

    public User createUserDtoToUser(CreateUserDTO createUserDto) {
        User user = new User();
        user.setUsername(createUserDto.getUsername());
        user.setPassword(createUserDto.getPassword());
        user.setMail(createUserDto.getMail());
        user.setPhoneNumber(createUserDto.getPhoneNumber());
        user.setName(createUserDto.getName());
        user.setSurname(createUserDto.getSurname());
        return user;
    }
}
