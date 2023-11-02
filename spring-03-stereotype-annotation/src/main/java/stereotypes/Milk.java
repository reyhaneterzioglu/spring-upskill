package stereotypes;

import org.springframework.stereotype.Component;

@Component("milkBean")
public class Milk extends Product {

    @Override
    public String toString() {
        return "Milk";
    }
}
