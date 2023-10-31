package wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wiring.config.ComputerConfig;

public class Test {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class);

        PC thePC = container.getBean(PC.class);

        System.out.println(thePC.getMonitor().getManufacturer());

    }
}


