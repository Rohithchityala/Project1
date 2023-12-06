package com.hotelMicroServices.hotelService.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class HotelMapper implements RowMapper<Hotel>{

	@Override
	public Hotel mapRow(ResultSet resultSet, int i) throws SQLException {
		Hotel hotel= new Hotel();
		hotel.setHotelId(resultSet.getString("hotelId"));
		hotel.setHotelName(resultSet.getString("hotelName"));
		hotel.setHotelAddress(resultSet.getString("hotelAddress"));
		hotel.setHotelDescription(resultSet.getString("hotelDescription"));
		return null;
	}

}
