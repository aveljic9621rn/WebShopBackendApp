package com.example.webshopbackend.service.implementation;

import com.example.webshopbackend.domain.Product;
import com.example.webshopbackend.domain.ShoppingCart;
import com.example.webshopbackend.repository.ShoppingCartRepository;
import com.example.webshopbackend.service.ProductService;
import com.example.webshopbackend.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final ShoppingCartRepository shoppingCartRepository;
    private final ProductService productService;

    @Autowired
    public ShoppingCartServiceImpl(ShoppingCartRepository shoppingCartRepository, ProductService productService) {
        this.shoppingCartRepository = shoppingCartRepository;
        this.productService = productService;
    }

    @Override
    public Optional<ShoppingCart> getShoppingCartById(Long id) {
        return shoppingCartRepository.findById(id);
    }

    @Override
    public void saveShoppingCart(ShoppingCart shoppingCart) {
        shoppingCartRepository.save(shoppingCart);
    }

    @Override
    public void deleteShoppingCart(Long id) {
        shoppingCartRepository.deleteById(id);
    }

    @Override
    public void addToCart(Long cartId, Long productId) {
        Optional<ShoppingCart> optionalShoppingCart = shoppingCartRepository.findById(cartId);
        if (optionalShoppingCart.isPresent()) {
            ShoppingCart shoppingCart = optionalShoppingCart.get();
            Product product = productService.getProductById(productId);
            if (product != null) {
                shoppingCart.getProducts().add(product);
                shoppingCartRepository.save(shoppingCart);
            }
        }
    }

    @Override
    public void removeFromCart(Long cartId, Long productId) {
        Optional<ShoppingCart> optionalShoppingCart = shoppingCartRepository.findById(cartId);
        if (optionalShoppingCart.isPresent()) {
            ShoppingCart shoppingCart = optionalShoppingCart.get();
            shoppingCart.getProducts().removeIf(product -> product.getProductID().equals(productId));
            shoppingCartRepository.save(shoppingCart);
        }
    }
}
