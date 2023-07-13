package com.product.springbootsearchrestapi.service;

import java.util.List;

import com.product.springbootsearchrestapi.entity.Product;

public interface ProductService {
    List<Product>searchProducts(String query);

    Product createProduct(Product product);
    
}
