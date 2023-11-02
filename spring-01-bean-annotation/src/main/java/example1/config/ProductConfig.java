package example1.config;

import example1.Cheese;
import example1.Milk;
import example1.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProductConfig {


    @Bean
//    @Primary
    public Product milkBean(){

        return new Milk();

    }

//    @Bean
////    @Primary
//    public Product milkBean2(){
//
//        return new Milk();
//
//    }

    @Bean("cheese")
    public Product cheeseBean(){

        return new Cheese();

    }


}
