package com.hotelMicroServices.hotelService.controller;


import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotelMicroServices.hotelService.entity.Hotel;
import com.hotelMicroServices.hotelService.service.HotelService;

import ch.qos.logback.classic.Logger;


@Controller
@RequestMapping("/hotel")
public class HotelController {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(HotelController.class);
	
	@Autowired
	public HotelService hotelService;
	
	@PostMapping("/addHotel")
	public ResponseEntity<Boolean> addUser(@RequestBody Hotel hotel){
		boolean hotelCreated=hotelService.addHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelCreated);
		
	}
	@GetMapping("/{hotel_Id}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable String hotel_Id){
		
		Hotel hotelById=hotelService.getHotelById(hotel_Id);
		logger.info("Fetching hotel by ID: {}", hotel_Id);
		return ResponseEntity.ok(hotelById) ;
		
	}
	@GetMapping("/allhotels")
	public ResponseEntity<List<Hotel>> getAllHotels(){
		List<Hotel> allHotels=hotelService.getAllHotels();
		return ResponseEntity.ok(allHotels) ;
		
	}
}
