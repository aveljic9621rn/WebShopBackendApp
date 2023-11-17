package com.example.webshopbackend.repository;

import com.example.webshopbackend.domain.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    ShoppingCart findShoppingCartById(Long id);
    Optional<ShoppingCart> findShoppingCartByUser(Long userId);
}
