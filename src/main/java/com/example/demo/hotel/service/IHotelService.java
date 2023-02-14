package com.example.demo.hotel.service;

import java.util.List;

import com.example.demo.hotel.modelo.Hotel;

public interface IHotelService {

	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
	
	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelOuterLeftJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelOuterFullJoin(String tipoHabitacion);
	
	public List<Hotel> buscarHotelJoinFetch(String tipoHabitacion);
}
