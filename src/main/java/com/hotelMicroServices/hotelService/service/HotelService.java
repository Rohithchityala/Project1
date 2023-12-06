package com.hotelMicroServices.hotelService.service;

import java.util.List;

import com.hotelMicroServices.hotelService.entity.Hotel;

public interface HotelService {
	
	boolean  addHotel(Hotel hotel);
	
	public List<Hotel> getAllHotels();
	
	public Hotel getHotelById(String hotelId);
	
	boolean  updateHotel(Hotel hotel);

}
