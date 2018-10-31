package com.client.app.service.repository;

import java.util.List;

import com.client.app.service.bean.EmployeeBean;

public interface EmployeeRepositoryAccess {
	
	List<EmployeeBean> getAllProfiles();
	EmployeeBean getProfile(String userId);

}
