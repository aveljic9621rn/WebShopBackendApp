package com.example.webshopbackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private String ProductID;
    private String name;
    private String description;
    private String features;
    private Double price;
    private String url;
    private String category;
    private String subcategory;
    private String images;
}
