package com.example.webshopbackend.dto;

import com.example.webshopbackend.domain.Product;
import com.example.webshopbackend.domain.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateShoppingCartDTO {
    private Long id;
    private User user;
    private List<Product> products;
}
