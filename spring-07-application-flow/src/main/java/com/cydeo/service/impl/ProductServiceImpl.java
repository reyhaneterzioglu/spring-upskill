package com.cydeo.service.impl;

import com.cydeo.dto.ProductDto;
import com.cydeo.entity.Product;
import com.cydeo.mapper.ProductMapper;
import com.cydeo.repository.ProductRepository;
import com.cydeo.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public void createProduct(ProductDto product) {

        productRepository.save(productMapper.convertToEntity(product));
    }

    @Override
    public List<ProductDto> listAllProducts() {

       return productRepository.findAll().stream().map(productMapper::convertToDto).collect(Collectors.toList());

//        List<ProductDto> productDtoList = new ArrayList<>();
//
//        for (Product product : productRepository.findAll()) {
//
//            ProductDto productDto = productMapper.convertToDto(product);
//            productDtoList.add(productDto);
//
//        }
//
//        return productDtoList;
    }

    @Override
    public ProductDto findById(Integer productId) {

        return productMapper.convertToDto(productRepository.findById(productId).get());

    }

    @Override
    public ProductDto findByName(String name) {
        return productMapper.convertToDto(productRepository.findByName(name));
    }

    @Override
    public int countAllProducts() {
        return productRepository.productCount();
    }
}