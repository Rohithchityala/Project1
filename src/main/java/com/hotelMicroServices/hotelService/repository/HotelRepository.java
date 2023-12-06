package com.hotelMicroServices.hotelService.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hotelMicroServices.hotelService.entity.Hotel;

@Repository
public interface HotelRepository {
	
public boolean addHotel(Hotel hotel);
	
	public List<Hotel> getAllHotels();
	
	public Hotel getHotelById(String hotelId);
	
	public boolean updateHotel(Hotel hotel);

}
