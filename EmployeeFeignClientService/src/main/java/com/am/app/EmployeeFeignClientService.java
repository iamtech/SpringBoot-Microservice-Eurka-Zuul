package com.am.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmployeeFeignClientService {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeFeignClientService.class, args);
	}

}
