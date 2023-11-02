package autowiring;

import autowiring.config.ProductConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ProductConfig.class);


    }
}
