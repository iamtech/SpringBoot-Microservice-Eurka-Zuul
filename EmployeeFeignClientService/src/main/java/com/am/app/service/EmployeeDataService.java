package com.am.app.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.am.app.bean.EmployeeBean;

//Calling Rest API from other service registered under same Eureka server
@FeignClient(name="employee-microservice-dataset")  // Feign contacts the Eureka server for this Service name to fetch data
public interface EmployeeDataService {
	
	@GetMapping("/profiles")
	List<EmployeeBean> getAllProfiles();

}
