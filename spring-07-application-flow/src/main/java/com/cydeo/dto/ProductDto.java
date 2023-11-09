package com.cydeo.dto;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ProductDto {

    private Integer id;
    private String name;
    private int price;

    public ProductDto(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
