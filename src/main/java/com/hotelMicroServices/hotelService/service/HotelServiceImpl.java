package com.hotelMicroServices.hotelService.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelMicroServices.hotelService.entity.Hotel;
import com.hotelMicroServices.hotelService.repository.HotelRepository;


@Service
public class HotelServiceImpl implements HotelService{
	@Autowired
	private HotelRepository hotelReposity;

	@Override
	public boolean addHotel(Hotel hotel) {
	String hotelId	=UUID.randomUUID().toString();
	hotel.setHotelId(hotelId);
		return hotelReposity.addHotel(hotel);
	}

	@Override
	public List<Hotel> getAllHotels() {
	
		return hotelReposity.getAllHotels();
		}

	@Override
	public Hotel getHotelById(String hotel_Id) {
	
		return hotelReposity.getHotelById(hotel_Id);
	}

	@Override
	public boolean updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelReposity.updateHotel(hotel);
	}

}
