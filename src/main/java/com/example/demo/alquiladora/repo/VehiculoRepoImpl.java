package com.example.demo.alquiladora.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.alquiladora.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class VehiculoRepoImpl implements IVehiculoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insert(Vehiculo vehiculo) {
		entityManager.persist(vehiculo);

	}

	@Override
	public Vehiculo select(String placa) {
		Vehiculo vehiculo=entityManager.find(Vehiculo.class , placa);
		return vehiculo;
	}

	@Override
	public void update(Vehiculo vehiculo) {
		entityManager.merge(vehiculo);

	}

	@Override
	public void delete(String placa) {
		Vehiculo vehiculo=entityManager.find(Vehiculo.class , placa);
		entityManager.remove(vehiculo);

	}

}
