package example1.loose_coupling;

import java.util.List;

public class ShoppingCart {

    int id;

//    Product product;
    List<Product> productList;

    public ShoppingCart(List<Product> productList) {
        this.id = 1;
        this.productList = productList;
        System.out.println("the cart is initialized successfully");
    }
}
