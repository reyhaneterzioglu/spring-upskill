package autowiring;

import org.springframework.stereotype.Component;

@Component
public class Cheese extends Product {

    private Milk milk;

    @Override
    public String toString() {
        return "Cheese";
    }


    public Milk getMilk() {
        return milk;
    }


    public void setMilk(Milk milk) {
        this.milk = milk;
    }
}
