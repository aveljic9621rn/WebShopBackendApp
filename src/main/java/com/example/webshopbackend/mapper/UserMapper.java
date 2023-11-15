package com.example.webshopbackend.mapper;

import com.example.webshopbackend.domain.User;
import com.example.webshopbackend.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDTO userToUserDTO(User user){
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

    public User userDTOToUser(UserDTO userDTO){
        User user = new User();
        user.setUserId(userDTO.getUserId());
        user.setName(userDTO.getName());
        user.setSurname(userDTO.getSurname());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setMail(userDTO.getMail());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        return user;
    }
}
