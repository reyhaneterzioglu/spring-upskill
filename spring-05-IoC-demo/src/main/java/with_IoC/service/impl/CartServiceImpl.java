package with_IoC.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import with_IoC.model.Cart;
import with_IoC.model.CartItem;
import with_IoC.model.Product;
import with_IoC.service.CartService;
import with_IoC.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CartServiceImpl implements CartService {

    public static Cart cart = new Cart(0, new ArrayList<>());

    public ProductService productService;

    @Autowired
    public CartServiceImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void addProduct(int productId, int quantity) {

        // find the product that will be added to the cart
        Product product = productService.findById(productId);

        // initialize a cart item
        CartItem cartItem = new CartItem();

        // set cart item fields
        cartItem.setProduct(product);
        cartItem.setQuantity(quantity);
        cartItem.setTotalAmount(product.getPrice() * quantity);

        // calculate the total cart amount
        // add the new cart item to the cart
        cart.setCartTotalAmount(cart.getCartTotalAmount() + cartItem.getTotalAmount());
        cart.getCartItemList().add(cartItem);


    }
}
