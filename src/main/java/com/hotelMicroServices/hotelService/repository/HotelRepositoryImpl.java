package com.hotelMicroServices.hotelService.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.hotelMicroServices.hotelService.entity.Hotel;
import com.hotelMicroServices.hotelService.entity.HotelMapper;

@Component
public class HotelRepositoryImpl implements HotelRepository{
	
	JdbcTemplate jdbcTemplate;
	public final String SQL_INSERT_HOTEL="insert into hotel(hotelId,hotelName,hotelAddress,hotelDescription)values(?,?,?,?)";
	public final String SQL_GET_ALLHOTELS="setect * from hotel";
	public final String SQL_GET_HOTELBY_ID="setect * from hotel where id=?";
	public final String SQL_UPDATE_HOTEL="update hotel set id=?,name=?,address=?,description=?";
	
	public HotelRepositoryImpl(DataSource dataSource) {
		jdbcTemplate= new JdbcTemplate(dataSource);
	}

	@Override
	public boolean addHotel(Hotel hotel) {
		
		return jdbcTemplate.update(SQL_INSERT_HOTEL, hotel.getHotelId(),hotel.getHotelName(),hotel.getHotelAddress(),hotel.getHotelDescription())>0;
	}

	@Override
	public List<Hotel> getAllHotels() {
		
		return jdbcTemplate.query(SQL_GET_ALLHOTELS, new HotelMapper());
	}

	@SuppressWarnings("deprecation")
	@Override
	public Hotel getHotelById(String hotelId) {
		
		return jdbcTemplate.queryForObject(SQL_GET_HOTELBY_ID, new Object[] {"id"}, new HotelMapper());
	}

	@Override
	public boolean updateHotel(Hotel hotel) {
		
		return jdbcTemplate.update(SQL_INSERT_HOTEL, hotel.getHotelId(),hotel.getHotelName(),hotel.getHotelAddress(),hotel.getHotelDescription())>0;

	}

}
