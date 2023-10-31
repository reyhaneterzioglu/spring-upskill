package example1.tight_coupling;

public class ShoppingCart {

    int id;
    Milk milk;
    Cheese cheese;

//    Bread bread;

    public ShoppingCart(Milk milk, Cheese cheese) {
        this.id = 1;
        this.milk = milk;
        this.cheese = cheese;
//        this.bread=bread;
        System.out.println("the cart is initialized successfully");
    }
}
