package com.bookmyshow.bangalore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
	@Id @GeneratedValue private Long id;
    private String name;
    private String email;
    private String passwordHash;
    private String userType;
    // getters and setters
}
