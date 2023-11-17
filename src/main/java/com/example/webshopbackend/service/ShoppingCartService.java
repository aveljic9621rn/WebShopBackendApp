package com.example.webshopbackend.service;

import com.example.webshopbackend.domain.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface ShoppingCartService {
    Optional<ShoppingCart> getShoppingCartById(Long id);
    void saveShoppingCart(ShoppingCart shoppingCart);

    void deleteShoppingCart(Long id);

    void addToCart(Long cartId, Long productId);

    void removeFromCart(Long cartId, Long productId);
}
