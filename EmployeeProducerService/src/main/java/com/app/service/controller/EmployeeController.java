package com.app.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.bean.EmployeeBean;
import com.app.service.dao.EmployeeRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
/*
 Commented as its been called from Zuul Gateway Service
 Uncomment if to call directly
@CrossOrigin

*/
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository profileRepository;
	
	@RequestMapping("/profiles")
	public EmployeeBean[] all() {
		List<EmployeeBean> profiles = profileRepository.getAllProfiles();
		return profiles.toArray(new EmployeeBean[profiles.size()]);
	}
	
	@RequestMapping("/profiles/{id}")
	@HystrixCommand(fallbackMethod = "getDefaultProfile")
	public EmployeeBean byId(@PathVariable("id") String userId) {
		EmployeeBean employeeBean = profileRepository.getProfile(userId);
		return employeeBean;
	}
	
	public EmployeeBean getDefaultProfile(String userId) {
		EmployeeBean employeeBean = new EmployeeBean("0000", "No employee");
		return employeeBean;
	}
}
