package com.example.demo.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hotel.modelo.Habitacion;
import com.example.demo.hotel.repo.IHabitacionRepo;

@Service
public class IHabitacionServiceImpl implements IHabitacionService {

	@Autowired
	private IHabitacionRepo habitacionRepo;
	
	@Override
	public List<Habitacion> buscarHabitacionOuterRightJoin() {
		// TODO Auto-generated method stub
		return habitacionRepo.buscarHabitacionOuterRightJoin();
	}

	@Override
	public List<Habitacion> buscarHabitacionOuterLeftJoin() {
		// TODO Auto-generated method stub
		return habitacionRepo.buscarHabitacionOuterLeftJoin();
	}

	@Override
	public List<Habitacion> buscarHabitacionOuterFullJoin() {
		// TODO Auto-generated method stub
		return habitacionRepo.buscarHabitacionOuterRightJoin();
	}

}
