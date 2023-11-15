package com.example.webshopbackend.service.implementation;

import com.example.webshopbackend.domain.User;
import com.example.webshopbackend.dto.CreateUserDTO;
import com.example.webshopbackend.dto.UserDTO;
import com.example.webshopbackend.mapper.UserMapper;
import com.example.webshopbackend.repository.UserRepository;
import com.example.webshopbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl() {
        userMapper = new UserMapper();
    }

    @Override
    public List<UserDTO> getAllUsers() {
        UserMapper userMapper = new UserMapper();
        List<User> users = userRepository.findAll();
        List<UserDTO> allUsers = new ArrayList<>();
        for(User u : users){
            UserDTO userDTO = userMapper.userToUserDTO(u);
            allUsers.add(userDTO);
        }
        return allUsers;
    }

    @Override
    public UserDTO addUser(CreateUserDTO createUserDTO) {
        User user = userMapper.createUserDtoToUser(createUserDTO);
        userRepository.save(user);
        return userMapper.userToUserDTO(user);
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        User user = userRepository.findByUserId(userDTO.getUserId());

        if (userDTO.getUsername() != null)
            user.setUsername(userDTO.getUsername());
        if (userDTO.getPassword() != null)
            user.setPassword(userDTO.getPassword());
        if (userDTO.getMail() != null)
            user.setMail(userDTO.getMail());
        if (userDTO.getPhoneNumber() != null)
            user.setPhoneNumber(userDTO.getPhoneNumber());
        if (userDTO.getName() != null)
            user.setName(userDTO.getName());
        if (userDTO.getSurname() != null)
            user.setSurname(userDTO.getSurname());

        userRepository.save(user);
        return userMapper.userToUserDTO(user);
    }
}
