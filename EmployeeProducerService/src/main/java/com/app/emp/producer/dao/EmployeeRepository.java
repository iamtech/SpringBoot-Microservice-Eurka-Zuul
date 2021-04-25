package com.app.emp.producer.dao;

import java.util.List;

import com.app.emp.producer.bean.EmployeeBean;


public interface EmployeeRepository {
	
	List<EmployeeBean> getAllProfiles();
	EmployeeBean getProfile(String userId);

}
