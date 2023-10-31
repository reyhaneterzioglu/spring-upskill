package example2.config;

import example2.casefactory.Case;
import example2.casefactory.DellCase;
import example2.monitorfactoriy.AcerMonitor;
import example2.monitorfactoriy.Monitor;
import example2.monitorfactoriy.SonyMonitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfig {


    @Bean
    @Primary
    public Monitor acerMonitor() {

        return new AcerMonitor("27inch Beast", "Acer", 27);

    }

    @Bean
    public Monitor sonyMonitor() {

        return new SonyMonitor("27inch Beast", "Sony", 27);
    }

    @Bean
    public Case dellCase(){

        return new DellCase("220B", "Dell", "240");

    }


}
