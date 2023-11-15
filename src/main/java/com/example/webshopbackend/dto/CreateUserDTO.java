package com.example.webshopbackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserDTO {
    private int userId;
    private String username;
    private String password;
    private String mail;
    private String phoneNumber;
    private String dateOfBirth;
    private String name;
    private String surname;
}
