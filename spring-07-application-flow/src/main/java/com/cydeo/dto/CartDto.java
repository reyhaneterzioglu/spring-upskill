package com.cydeo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CartDto {

    private Integer id;
    private int cartTotalAmount;

    private List<CartItemDto> cartItemList;

    public CartDto(int cartTotalAmount, List<CartItemDto> cartItemList) {
        this.cartTotalAmount = cartTotalAmount;
        this.cartItemList = cartItemList;
    }
}
