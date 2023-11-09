package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cartItems")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CartItem{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Product product;
    private int quantity;
    private int totalAmount;


    @Override
    public String toString() {
        return "CartItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
