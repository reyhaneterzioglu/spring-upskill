package com.cydeo.controller;

import com.cydeo.dto.ProductDto;
import com.cydeo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<ProductDto> productList() {

        return productService.listAllProducts();

    }

    @PostMapping
    public String createProduct(@RequestBody ProductDto product) {

        productService.createProduct(product);

        return "Product successfully created";
    }

    @GetMapping("{name}")
    public ProductDto findProductByName(@PathVariable String name) {

        return productService.findByName(name);

    }

    @GetMapping("/count")
    public int countProducts() {

        return productService.countAllProducts();

    }
}
