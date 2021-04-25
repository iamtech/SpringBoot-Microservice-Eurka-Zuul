package com.am.app.emp.client.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.am.app.emp.client.bean.EmployeeBean;
import com.am.app.emp.client.service.fallback.EmployeeDataServiceFallback;

//Calling Rest API from other service registered under same Eureka server
//Feign contacts the Eureka server for employee-microservice-dataset Service name to fetch data
//Feign will look for Fallback method in EmployeeDataServiceFallback.class
@FeignClient(name="employee-microservice-dataset", fallback = EmployeeDataServiceFallback.class)  
public interface EmployeeDataService {
	
	@GetMapping("/profiles")
//	@HystrixCommand(fallbackMethod = "getDefaultAlbums")
	public List<EmployeeBean> getAllProfiles();
	

}
