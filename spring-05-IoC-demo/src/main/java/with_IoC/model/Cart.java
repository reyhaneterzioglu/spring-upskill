package with_IoC.model;

import java.util.List;

public class Cart {

    private int cartTotalAmount;
    private List<CartItem> cartItemList;

    public Cart(int cartTotalAmount, List<CartItem> cartItemList) {
        this.cartTotalAmount = cartTotalAmount;
        this.cartItemList = cartItemList;
    }

    public int getCartTotalAmount() {
        return cartTotalAmount;
    }

    public void setCartTotalAmount(int cartTotalAmount) {
        this.cartTotalAmount = cartTotalAmount;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }
}
