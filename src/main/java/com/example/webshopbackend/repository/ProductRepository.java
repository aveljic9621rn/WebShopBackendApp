package com.example.webshopbackend.repository;

import com.example.webshopbackend.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    Product findProductByProductID(String ID);
    Optional<Product> findProductByName(String name);
    Optional<Product> findProductByCategory(String category);
    Optional<Product> findProductBySubcategory(String subcategory);
}
