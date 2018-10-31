package com.app.service.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.app.service.bean.EmployeeBean;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	private Map<String, EmployeeBean> empData = new HashMap<String, EmployeeBean>();
		
		public EmployeeRepositoryImpl() {
			EmployeeBean emp = new EmployeeBean("1000", "Vincent");
			empData.put("1000", emp);
			emp = new EmployeeBean("2000", "Harry");
			empData.put("2000", emp);
			emp = new EmployeeBean("3000", "Clark");
			empData.put("3000", emp);
			emp = new EmployeeBean("4000", "Stephen");
			empData.put("4000", emp);
		}
		
		@Override
		public List<EmployeeBean> getAllProfiles() {
			return new ArrayList<EmployeeBean>(empData.values());
		}
	
		@Override
		public EmployeeBean getProfile(String userId) {
			return empData.get(userId);
		}
}
