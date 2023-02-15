package com.example.demo.hotel.repo;

import java.util.List;

import com.example.demo.hotel.modelo.Hotel;

public interface IHotelRepo {

	//buscar hoteles por tipo de habitacion por ejemplo habitaciones que sean VIP
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
	
	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelOuterLeftJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelOuterFullJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelJoinFetch(String tipoHabitacion);
	
	//
	public List<Hotel> buscarHotelOuterRightJoin();
	public List<Hotel> buscarHotelOuterLeftJoin();
	public List<Hotel> buscarHotelOuterFullJoin( );

}
