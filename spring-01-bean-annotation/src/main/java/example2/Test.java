package example2;

import example2.casefactory.Case;
import example2.config.ComputerConfig;
import example2.monitorfactoriy.Monitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class);


        PC thePC = new PC(container.getBean(Case.class), container.getBean(Monitor.class) );

        thePC.powerUp();

    }
}
