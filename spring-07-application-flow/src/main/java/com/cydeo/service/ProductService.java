package com.cydeo.service;

import com.cydeo.dto.ProductDto;

import java.util.List;

public interface ProductService {

    void createProduct(ProductDto product);

    List<ProductDto> listAllProducts();

    ProductDto findById(Integer productId);

    ProductDto findByName(String name);

    int countAllProducts();

}
