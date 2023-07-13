package com.product.springbootsearchrestapi.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.springbootsearchrestapi.entity.Product;
import com.product.springbootsearchrestapi.repository.ProductRepository;
import com.product.springbootsearchrestapi.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;
    

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> searchProducts(String query) {
        List<Product>products = productRepository.searchProductsSQL(query);
        return products;
    }


    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
    
}
