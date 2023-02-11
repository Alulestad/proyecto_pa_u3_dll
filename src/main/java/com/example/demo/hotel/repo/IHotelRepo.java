package com.example.demo.hotel.repo;

import java.util.List;

import com.example.demo.hotel.modelo.Hotel;

public interface IHotelRepo {

	//buscar hoteles por tipo de habitacion por ejemplo habitaciones que sean VIP
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
}
