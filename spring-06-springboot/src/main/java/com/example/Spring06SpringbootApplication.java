package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // consists of => @EnableAutoConfiguration, @ComponentScan, @SpringBootConfiguration
public class Spring06SpringbootApplication {

	public static void main(String[] args) {  // bootstrapping the application
		SpringApplication.run(Spring06SpringbootApplication.class, args); // creating Spring IoC container

	}
}
