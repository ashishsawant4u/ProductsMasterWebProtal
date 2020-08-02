package com.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class ProductsMasterWebProtalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsMasterWebProtalApplication.class, args);
	}

}
