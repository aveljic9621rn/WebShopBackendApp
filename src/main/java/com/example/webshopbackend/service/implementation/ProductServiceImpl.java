package com.example.webshopbackend.service.implementation;

import com.example.webshopbackend.domain.Product;
import com.example.webshopbackend.domain.User;
import com.example.webshopbackend.dto.CreateProductDTO;
import com.example.webshopbackend.dto.ProductDTO;
import com.example.webshopbackend.mapper.ProductMapper;
import com.example.webshopbackend.repository.ProductRepository;
import com.example.webshopbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

   ProductMapper productMapper = new ProductMapper();
    @Autowired
    ProductRepository productRepository;
    @Override
    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductDTO> allProducts = new ArrayList<>();
        for(Product p : products){
            ProductDTO productDTO = productMapper.productToProductDto(p);
            allProducts.add(productDTO);
        }
        return allProducts;
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
}
