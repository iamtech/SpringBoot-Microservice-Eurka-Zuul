package com.client.app.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.client.app.service.controller.EmployeeClientController;
import com.client.app.service.controller.MessageFromConfig;
import com.client.app.service.repository.EmployeeRepositoryAccess;
import com.client.app.service.repository.EmployeeRepositoryAccessImpl;

@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"client.app.service"})
@ComponentScan(basePackageClasses = {EmployeeClientController.class,MessageFromConfig.class}, basePackages="client.app.service")
public class EmployeeAccessServiceApplication {
	
	public static final String EMPLOYEE_DATA_SERVICE_URL = "http://employee-microservice-dataset";
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeAccessServiceApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public EmployeeRepositoryAccess profileRepository(){
		return new EmployeeRepositoryAccessImpl(EMPLOYEE_DATA_SERVICE_URL);
	}
}
