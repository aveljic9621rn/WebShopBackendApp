package com.example.webshopbackend.controller;

import com.example.webshopbackend.dto.CreateProductDTO;
import com.example.webshopbackend.dto.ProductDTO;
import com.example.webshopbackend.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shopping-cart")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @PostMapping("/{cartId}/add-to-cart/{productId}")
    public ResponseEntity<String> addToCart(@PathVariable Long cartId, @PathVariable Long productId) {
        shoppingCartService.addToCart(cartId, productId);
        return new ResponseEntity<>("Product added to cart successfully", HttpStatus.OK);
    }

    @PostMapping("/{cartId}/remove-from-cart/{productId}")
    public ResponseEntity<String> removeFromCart(@PathVariable Long cartId, @PathVariable Long productId) {
        shoppingCartService.removeFromCart(cartId, productId);
        return new ResponseEntity<>("Product removed from cart successfully", HttpStatus.OK);
    }
}
