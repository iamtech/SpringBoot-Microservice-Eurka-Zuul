package com.app.service.bean;

public class TicketSystemBean {
	
	public int ticketCount;
	public int ticketResolved;
	public int year;
	
	public TicketSystemBean(int ticketCount, int ticketResolved,int year) {
		super();
		this.ticketCount = ticketCount;
		this.ticketResolved = ticketResolved;
		this.year = year;
	}
	
	public int getTicketCount() {
		return ticketCount;
	}
	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}
	public int getTicketResolved() {
		return ticketResolved;
	}
	public void setTicketResolved(int ticketResolved) {
		this.ticketResolved = ticketResolved;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

}
