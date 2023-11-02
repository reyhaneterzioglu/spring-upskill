package without_IoC;

import without_IoC.model.Product;
import without_IoC.service.CartService;
import without_IoC.service.ProductService;
import without_IoC.service.impl.CartServiceImpl;
import without_IoC.service.impl.ProductServiceImpl;

public class ShoppingApplication {

    public static void main(String[] args) {


        ProductService productService = new ProductServiceImpl();

        CartService cartService = new CartServiceImpl(productService);

        Product product = new Product("milk", 2);

        productService.createProduct(product);

        cartService.addProduct(product.getId(), 2);


    }
}
