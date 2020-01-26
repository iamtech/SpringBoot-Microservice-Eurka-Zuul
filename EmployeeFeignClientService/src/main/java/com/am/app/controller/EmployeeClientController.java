package com.am.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.am.app.bean.AlbumBean;
import com.am.app.bean.EmployeeBean;
import com.am.app.service.AlbumClientService;
import com.am.app.service.EmployeeDataService;

@RestController
public class EmployeeClientController {
	
	@Autowired
	AlbumClientService albumClientService;
	
	@Autowired
	EmployeeDataService employeeDataService;
	
	//calling Rest API from other service registered under same Eureka server
	@GetMapping("/employees")
	public List<EmployeeBean> getAllEmployees(){
		List<EmployeeBean> employeeList = employeeDataService.getAllProfiles();
		employeeList.stream().forEach(e -> System.out.println(e.getUserId()+" "+e.getName()));
		return employeeList;
	}
	
	// calling external API for testing
	@GetMapping("/albums")
	public List<AlbumBean> showAllAlbums(){
		List<AlbumBean> albumList = albumClientService.getAllAlbums();
		albumList.stream().forEach(a -> System.out.println(a.getId()+" "+a.getUserId()+" "+a.getTitle()));
		return albumList;
	}

}
