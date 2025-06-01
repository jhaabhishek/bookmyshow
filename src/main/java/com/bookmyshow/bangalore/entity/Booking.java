package com.bookmyshow.bangalore.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {
	  @Id @GeneratedValue private Long id;
	    @ManyToOne private UserEntity user;
	    @ManyToOne private ShowEntity show;
	    private Date bookingTime;
	    private double totalAmount;
	    private String status;
	    // getters and setters
}
