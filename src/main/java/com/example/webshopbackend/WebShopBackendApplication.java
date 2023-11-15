package com.example.webshopbackend;

import FileUtils.JSONParser;
import com.example.webshopbackend.domain.Product;
import com.example.webshopbackend.repository.ProductRepository;
import com.example.webshopbackend.service.implementation.ProductServiceImpl;
import com.fasterxml.jackson.core.JsonParser;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class WebShopBackendApplication {


    public static void main(String[] args) {
        SpringApplication.run(WebShopBackendApplication.class, args);
        ProductServiceImpl productService = new ProductServiceImpl();
        productService.getAllProducts();
    }
}
