package autowiring;

import java.util.List;

public class ShoppingCart {

    int id;

    List<Product> productList;

    public ShoppingCart(List<Product> productList) {
        this.id = 1;
        this.productList = productList;
    }
}
