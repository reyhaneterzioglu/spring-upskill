package autowiring;

import autowiring.config.ProductConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ProductConfig.class);

//
//        System.out.println(container.getBean(Milk.class));
//
//        System.out.println(container.getBean(Cheese.class));

        Cheese cheese = container.getBean(Cheese.class);

        System.out.println(cheese.getMilk());

    }
}
