package com.example.demo.hotel.repo;

import java.util.List;

import com.example.demo.hotel.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class HabitacionRepoImpl implements IHabitacionRepo {

	@PersistenceContext
	private EntityManager entityManager;
	

}
