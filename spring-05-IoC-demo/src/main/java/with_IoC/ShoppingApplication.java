package with_IoC;

import with_IoC.config.ShoppingConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShoppingApplication {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ShoppingConfig.class);


    }
}
