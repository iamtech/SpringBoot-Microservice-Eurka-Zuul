package com.app.service.dao;

import java.util.List;

import com.app.service.bean.EmployeeBean;


public interface EmployeeRepository {
	
	List<EmployeeBean> getAllProfiles();
	EmployeeBean getProfile(String userId);

}
