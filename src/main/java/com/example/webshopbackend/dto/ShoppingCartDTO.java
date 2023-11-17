package com.example.webshopbackend.dto;

import com.example.webshopbackend.domain.Product;
import com.example.webshopbackend.domain.User;


import java.util.List;

public class ShoppingCartDTO {
    private Long id;
    private User user;
    private List<Product> products;
}
