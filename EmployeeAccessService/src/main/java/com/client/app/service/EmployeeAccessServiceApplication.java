package com.client.app.service;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import org.xmlpull.v1.XmlPullParserException;

import com.client.app.service.controller.EmployeeClientController;
import com.client.app.service.controller.MessageFromConfig;
import com.client.app.service.repository.EmployeeRepositoryAccess;
import com.client.app.service.repository.EmployeeRepositoryAccessImpl;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
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
	
	@Bean
	public Docket api() throws IOException, XmlPullParserException {
        return new Docket(DocumentationType.SWAGGER_2)
          .select()
          .apis(RequestHandlerSelectors.basePackage("com.client.app.service.controller"))
          .paths(PathSelectors.any())
          .build()
          .tags(new Tag("EmployeeClient","Controller for getting Employee data from Producer Service "),
        		  new Tag("MsgConfigServer", "Get Message From Config Server"));
	}
    
}
