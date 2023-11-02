package autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cheese extends Product {

//    @Autowired
    private Milk milk;

//    @Autowired
    public Cheese(Milk milk) {
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Cheese";
    }


    public Milk getMilk() {
        return milk;
    }


//    @Autowired
    public void setMilk(Milk milk) {
        this.milk = milk;
    }
}
