package com.am.app.emp.client.service.fallback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.am.app.emp.client.bean.EmployeeBean;
import com.am.app.emp.client.service.EmployeeDataService;

@Component
public class EmployeeDataServiceFallback implements EmployeeDataService{
	

	// Fallback method 
	@Override
	public List<EmployeeBean> getAllProfiles(){
		
		List<EmployeeBean> dList = new ArrayList<EmployeeBean>();
		dList.add(new EmployeeBean("0000", "Default_Employee_Hystrix"));
		return dList;
	}

}
