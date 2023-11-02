package autowiring;

import org.springframework.stereotype.Component;

@Component
public class Milk extends Product {


    @Override
    public String toString() {
        return "Milk";
    }
}
