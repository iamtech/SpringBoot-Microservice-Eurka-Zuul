package com.app.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.dao.TicketSystemDoa;

/*
Commented as its been called from Zuul Gateway Service
Uncomment if to call directly

@CrossOrigin

*/
@RestController
public class TicketSystemController {
	
	@Autowired
	TicketSystemDoa tcdao;
	
	@RequestMapping("/yeardata")
	public List<Integer> all() {
		
		return tcdao.getTicktPerYear();
	}

}
