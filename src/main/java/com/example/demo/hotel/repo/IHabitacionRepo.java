package com.example.demo.hotel.repo;

import java.util.List;

import com.example.demo.hotel.modelo.Habitacion;
import com.example.demo.hotel.modelo.Hotel;

public interface IHabitacionRepo {

	
	
	//
	public List<Habitacion> buscarHabitacionOuterRightJoin();
	public List<Habitacion> buscarHabitacionOuterLeftJoin();
	public List<Habitacion> buscarHabitacionOuterFullJoin( );
	

	
}
