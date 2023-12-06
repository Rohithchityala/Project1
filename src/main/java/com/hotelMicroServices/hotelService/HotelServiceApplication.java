package com.hotelMicroServices.hotelService;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class HotelServiceApplication {

	public static void main(String[] args) {
//		final org.slf4j.Logger logger = LoggerFactory.getLogger(HotelServiceApplication.class);
		SpringApplication.run(HotelServiceApplication.class, args);
		
	}

}
