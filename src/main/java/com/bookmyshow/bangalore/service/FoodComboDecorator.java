package com.bookmyshow.bangalore.service;

import com.bookmyshow.bangalore.model.Ticket;

public class FoodComboDecorator implements Ticket {

	  private Ticket ticket;
	    public FoodComboDecorator(Ticket ticket) { this.ticket = ticket; }
	    public String getDescription() { return ticket.getDescription() + ", Food Combo"; }
	    public double getCost() { return ticket.getCost() + 100; }
	}

