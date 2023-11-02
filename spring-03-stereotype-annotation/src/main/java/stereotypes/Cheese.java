package stereotypes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Cheese extends Product {

    @Override
    public String toString() {
        return "Cheese";
    }
}
