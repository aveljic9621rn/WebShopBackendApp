package com.example.webshopbackend.service;

import com.example.webshopbackend.domain.Product;
import com.example.webshopbackend.dto.CreateProductDTO;
import com.example.webshopbackend.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    ProductDTO addProduct(CreateProductDTO createProductDTO);
    ProductDTO updateProduct(ProductDTO productDTO);
}
