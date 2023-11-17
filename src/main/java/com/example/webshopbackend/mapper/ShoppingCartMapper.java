package com.example.webshopbackend.mapper;

import com.example.webshopbackend.domain.ShoppingCart;
import com.example.webshopbackend.dto.CreateShoppingCartDTO;
import com.example.webshopbackend.dto.ShoppingCartDTO;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartMapper {
    public ShoppingCart createShoppingCartDTOToShoppingCart(CreateShoppingCartDTO createShoppingCartDTO){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setId(createShoppingCartDTO.getId());
        shoppingCart.setUser(createShoppingCartDTO.getUser());
        shoppingCart.setProducts(createShoppingCartDTO.getProducts());
        return shoppingCart;
    }
    public ShoppingCartDTO shoppingCartToShoppingCartDTO(ShoppingCart shoppingCart){
        ShoppingCartDTO shoppingCartDTO = new ShoppingCartDTO();
        shoppingCartDTO.setId(shoppingCart.getId());
        shoppingCartDTO.setUser(shoppingCart.getUser());
        shoppingCartDTO.setProducts(shoppingCart.getProducts());
        return shoppingCartDTO;
    }
}
