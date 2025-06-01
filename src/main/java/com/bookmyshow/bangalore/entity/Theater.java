package com.bookmyshow.bangalore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Theater {
	@Id @GeneratedValue private Long id;
    private String name;
    private String city;
    private String address;
}
