package com.example.webshopbackend.mapper;

import com.example.webshopbackend.domain.Product;
import com.example.webshopbackend.dto.CreateProductDTO;
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
    public Product CreateProductDTOToProduct(CreateProductDTO createProductDTO){
        Product product = new Product();
        product.setProductID(createProductDTO.getProductID());
        product.setName(createProductDTO.getName());
        product.setCategory(createProductDTO.getCategory());
        product.setDescription(createProductDTO.getDescription());
        product.setImages(createProductDTO.getImages());
        product.setFeatures(createProductDTO.getFeatures());
        product.setPrice(createProductDTO.getPrice());
        product.setUrl(createProductDTO.getUrl());
        product.setSubcategory(createProductDTO.getSubcategory());
        return product;
    }
}
