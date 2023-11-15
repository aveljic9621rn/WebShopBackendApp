package com.example.webshopbackend.mapper;

import com.example.webshopbackend.domain.Product;
import com.example.webshopbackend.dto.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDTO productToProductDto(Product product){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductID(product.getProductID());
        productDTO.setName(product.getName());
        productDTO.setCategory(product.getCategory());
        productDTO.setDescription(product.getDescription());
        productDTO.setImages(product.getImages());
        productDTO.setFeatures(product.getFeatures());
        productDTO.setPrice(product.getPrice());
        productDTO.setUrl(product.getUrl());
        productDTO.setSubcategory(product.getSubcategory());
        return productDTO;
    }

    public Product ProductDTOToProduct(ProductDTO productDTO){
        Product product = new Product();
        product.setProductID(productDTO.getProductID());
        product.setName(productDTO.getName());
        product.setCategory(productDTO.getCategory());
        product.setDescription(productDTO.getDescription());
        product.setImages(productDTO.getImages());
        product.setFeatures(productDTO.getFeatures());
        product.setPrice(productDTO.getPrice());
        product.setUrl(productDTO.getUrl());
        product.setSubcategory(productDTO.getSubcategory());
        return product;
    }
}
