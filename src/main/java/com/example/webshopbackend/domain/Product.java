package com.example.webshopbackend.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @Column(name = "ProductId")
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
