package com.example.webshopbackend.controller;

import com.example.webshopbackend.dto.CreateProductDTO;
import com.example.webshopbackend.dto.ProductDTO;
import com.example.webshopbackend.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ProductController {
    ProductService productService;
    @PutMapping("/products")
    public ResponseEntity<ProductDTO> addProduct(@RequestHeader("Authorization") String authorization, @RequestBody CreateProductDTO createProductDTO) {
        return new ResponseEntity<>(productService.addProduct(createProductDTO), HttpStatus.OK);
    }
    @PostMapping("/products")
    public ResponseEntity<ProductDTO> updateProduct(@RequestBody ProductDTO productDTO) {
        return new ResponseEntity<>(productService.updateProduct(productDTO), HttpStatus.OK);
    }

}
