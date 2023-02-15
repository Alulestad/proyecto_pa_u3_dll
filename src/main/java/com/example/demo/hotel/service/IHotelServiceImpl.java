package com.example.demo.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hotel.modelo.Hotel;
import com.example.demo.hotel.repo.IHotelRepo;

@Service
public class IHotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepo hotelRepo;
	
	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelInnerJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterRightJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelOuterLeftJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterLeftJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelOuterFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterFullJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelJoinFetch(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelJoinFetch(tipoHabitacion);
	}

	//
	@Override
	public List<Hotel> buscarHotelOuterRightJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterRightJoin();
	}

	@Override
	public List<Hotel> buscarHotelOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterLeftJoin();
	}

	@Override
	public List<Hotel> buscarHotelOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscarHotelOuterFullJoin();
	}
	
	

}
