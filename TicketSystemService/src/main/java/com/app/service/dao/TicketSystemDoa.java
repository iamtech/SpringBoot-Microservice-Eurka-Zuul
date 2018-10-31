package com.app.service.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.service.bean.TicketSystemBean;

@Repository
public class TicketSystemDoa {
	
	public List<TicketSystemBean> getTicktStats(){
		
		List<TicketSystemBean> tickList = new ArrayList<>();
		TicketSystemBean tcb = new TicketSystemBean(2000, 788, 2014);
		tickList.add(tcb);
		tcb = new TicketSystemBean(1500, 875, 2015);
		tickList.add(tcb);
		tcb = new TicketSystemBean(1700, 1160, 2016);
		tickList.add(tcb);
		tcb = new TicketSystemBean(1200, 968, 2017);
		tickList.add(tcb);
		tcb = new TicketSystemBean(1000, 755, 2018);
		tickList.add(tcb);
		return tickList;
	}
	
	public List<Integer> getTicktPerYear(){
		List<Integer> tickCount = new ArrayList<>();
		tickCount.add(2000);
		tickCount.add(1500);
		tickCount.add(1700);
		tickCount.add(1200);
		tickCount.add(1000);
		return tickCount;
	}

}
