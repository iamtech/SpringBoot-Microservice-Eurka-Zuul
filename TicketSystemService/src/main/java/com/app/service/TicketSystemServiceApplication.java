package com.app.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import com.app.service.controller.TicketSystemController;


@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackageClasses = TicketSystemController.class,basePackages="com.app.service")
public class TicketSystemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketSystemServiceApplication.class, args);
	}
}
