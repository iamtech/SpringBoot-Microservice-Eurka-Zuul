package com.app.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import com.app.service.controller.EmployeeController;

@EnableCircuitBreaker
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackageClasses = EmployeeController.class,basePackages="com.app.service")

public class EmployeeProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProducerServiceApplication.class, args);
	}
}
