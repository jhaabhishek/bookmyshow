package com.bookmyshow.bangalore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Screen {
	@Id @GeneratedValue private Long id;
    @ManyToOne private Theater theater;
    private String name;
    // getters and setters
}
