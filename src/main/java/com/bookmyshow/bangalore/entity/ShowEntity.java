package com.bookmyshow.bangalore.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ShowEntity {
	@Id @GeneratedValue private Long id;
    @ManyToOne private Movies movie;
    @ManyToOne private Screen screen;
    private Date showTime;
    private double price;
    // getters and setters
}
