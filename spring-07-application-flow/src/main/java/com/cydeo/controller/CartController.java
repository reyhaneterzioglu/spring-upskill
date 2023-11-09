package com.cydeo.controller;

import com.cydeo.dto.CartDto;
import com.cydeo.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cart")
@AllArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping
    public List<CartDto> cartList() {

        return cartService.listAllCarts();
    }


    @PostMapping("addToCart/{productId}")
    public String addToCart(@PathVariable Integer productId, @RequestBody int quantity) {

        cartService.addProduct(productId, quantity);

        return "Product added to cart";
    }

}
