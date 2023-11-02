package with_IoC;

import with_IoC.config.ShoppingConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import with_IoC.model.Product;
import with_IoC.service.CartService;
import with_IoC.service.ProductService;


public class ShoppingApplication {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ShoppingConfig.class);

        ProductService productService = container.getBean(ProductService.class);

        CartService cartService = container.getBean(CartService.class);

        Product product = new Product("milk", 2);

        productService.createProduct(product);

        cartService.addProduct(product.getId(), 2);

    }
}
