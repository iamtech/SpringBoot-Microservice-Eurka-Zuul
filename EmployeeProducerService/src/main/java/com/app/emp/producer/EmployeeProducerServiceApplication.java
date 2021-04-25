package com.app.emp.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import com.app.emp.producer.controller.EmployeeController;

@EnableCircuitBreaker
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackageClasses = EmployeeController.class,basePackages="com.app.emp.producer")

public class EmployeeProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProducerServiceApplication.class, args);
	}
}
