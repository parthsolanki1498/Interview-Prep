package com.example.ioc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Customers customersObject = context.getBean(Customers.class);
		customersObject.display();
	}

}
