package com.bookmyshow.bangalore.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Payment {
	   @Id @GeneratedValue private Long id;
	    @ManyToOne private Booking booking;
	    private Date paymentTime;
	    private double amount;
	    private String paymentMethod;
	    private String status;
	    // getters and setters
}
