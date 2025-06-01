package com.bookmyshow.bangalore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Seat {
	  @Id @GeneratedValue private Long id;
	    @ManyToOne private Screen screen;
	    private String seatNumber;
	    private String seatType;
	    // getters and setters
}
