package com.example.webshopbackend.service.implementation;

import FileUtils.JSONParser;
import com.example.webshopbackend.domain.Product;
import com.example.webshopbackend.dto.CreateProductDTO;
import com.example.webshopbackend.dto.ProductDTO;
import com.example.webshopbackend.mapper.ProductMapper;
import com.example.webshopbackend.repository.ProductRepository;
import com.example.webshopbackend.service.ProductService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

   ProductMapper productMapper = new ProductMapper();
    @Autowired
    ProductRepository productRepository;

    public void saveProducts(List<Product> products) {
        for (Product p : products) {
            Product product = new Product();
            product.setName(p.getName());
            product.setPrice(p.getPrice());
            productRepository.save(product);
        }
    }
    @Override
    public List<Product> getAllProducts() {
        final String filePath = "src/main/resources/products.json";

            ObjectMapper objectMapper = new ObjectMapper();
        List<Product> products = null;
        try {
            products = objectMapper.readValue(new File(filePath), new TypeReference<>() {});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Save products to the database
            productRepository.saveAll(products);

            return products;
        }
    @Override
    public ProductDTO addProduct(CreateProductDTO createProductDTO) {
        Product product = productMapper.CreateProductDTOToProduct(createProductDTO);
        productRepository.save(product);
        return productMapper.productToProductDto(product);
    }

    @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
       Product product = productRepository.findProductByProductID(productDTO.getProductID());
       if(productDTO.getName() != null)
           product.setName(productDTO.getName());
       if(productDTO.getCategory() != null)
           product.setCategory(productDTO.getCategory());
       if(productDTO.getSubcategory() != null)
           product.setSubcategory(productDTO.getSubcategory());
       if(productDTO.getFeatures() != null)
           product.setFeatures(productDTO.getFeatures());
       if(productDTO.getDescription() != null)
           product.setDescription(productDTO.getDescription());
       if(productDTO.getImages() != null)
           product.setImages(productDTO.getImages());
       if(productDTO.getPrice() != null)
           product.setPrice(productDTO.getPrice());
       if(productDTO.getUrl() != null)
           product.setUrl(productDTO.getUrl());
       productRepository.save(product);
       return productMapper.productToProductDto(product);
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findProductByProductID(String.valueOf(productId));
    }
}
