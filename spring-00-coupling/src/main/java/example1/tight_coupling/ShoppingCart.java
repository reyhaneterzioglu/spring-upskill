package example1.tight_coupling;

public class ShoppingCart {

    int id;
    Milk milk;
    Cheese cheese;

    public ShoppingCart(Milk milk, Cheese cheese) {
        this.id = 1;
        this.milk = milk;
        this.cheese = cheese;
        System.out.println("the cart is initialized successfully");
    }
}
