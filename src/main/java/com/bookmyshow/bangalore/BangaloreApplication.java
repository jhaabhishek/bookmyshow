package com.bookmyshow.bangalore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class BangaloreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BangaloreApplication.class, args);
	}

}
