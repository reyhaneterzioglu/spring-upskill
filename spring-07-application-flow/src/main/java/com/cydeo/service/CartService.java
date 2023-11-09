package com.cydeo.service;

import com.cydeo.dto.CartDto;

import java.util.List;

public interface CartService {


    void addProduct(int productId, int quantity);

    List<CartDto> listAllCarts();

}
