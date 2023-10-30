package wiring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import wiring.PC;
import wiring.casefactory.Case;
import wiring.casefactory.DellCase;
import wiring.monitorfactoriy.Monitor;
import wiring.monitorfactoriy.SonyMonitor;

@Configuration
public class ComputerConfig {

    @Bean
    public Monitor sonyMonitor() {

        return new SonyMonitor("25 inch Beast", "Sony", 25);

    }

    @Bean
    public Case caseBean() {

        return new DellCase("220B", "Dell", "240");

    }
}