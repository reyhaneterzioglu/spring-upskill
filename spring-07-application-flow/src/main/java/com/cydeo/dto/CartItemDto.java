package com.cydeo.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CartItemDto{

    private Integer id;
    private ProductDto product;
    private int quantity;
    private int totalAmount;

}
