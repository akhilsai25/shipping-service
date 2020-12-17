package com.egen.shipping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EgenShippingServiceApplication {

	static final String queueName = "shipping-queue";

	public static void main(String[] args) {
		SpringApplication.run(EgenShippingServiceApplication.class, args);
	}

}
