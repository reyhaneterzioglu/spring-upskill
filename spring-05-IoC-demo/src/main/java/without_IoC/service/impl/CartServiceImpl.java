package without_IoC.service.impl;

import without_IoC.model.CartItem;
import without_IoC.model.Product;
import without_IoC.model.Cart;
import without_IoC.service.CartService;
import without_IoC.service.ProductService;

import java.util.ArrayList;

public class CartServiceImpl implements CartService {

    public static Cart cart = new Cart(0, new ArrayList<>());

    public ProductService productService;

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
