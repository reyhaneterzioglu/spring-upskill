package example1.tight_coupling;

public class Test {

    public static void main(String[] args) {

        Milk milk = new Milk();
        Cheese cheese = new Cheese();

        ShoppingCart shoppingCart = new ShoppingCart(milk, cheese);

    }
}
