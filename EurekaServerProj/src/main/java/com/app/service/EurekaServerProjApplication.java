package com.app.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerProjApplication.class, args);
	}
}
