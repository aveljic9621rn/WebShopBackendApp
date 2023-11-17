package com.example.webshopbackend.repository;

import com.example.webshopbackend.domain.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    ShoppingCart findShoppingCartById(Long id);
    Optional<ShoppingCart> findShoppingCartByUser(Long userId);
}
