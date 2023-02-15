package com.example.demo.hotel.service;

import java.util.List;

import com.example.demo.hotel.modelo.Habitacion;

public interface IHabitacionService {

	
	//
	public List<Habitacion> buscarHabitacionOuterRightJoin();
	public List<Habitacion> buscarHabitacionOuterLeftJoin();
	public List<Habitacion> buscarHabitacionOuterFullJoin( );
}
