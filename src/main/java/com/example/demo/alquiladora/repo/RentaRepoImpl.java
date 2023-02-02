package com.example.demo.alquiladora.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.alquiladora.modelo.Renta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class RentaRepoImpl implements IRentaRepo {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insert(Renta renta) {
		entityManager.persist(renta);

	}

	@Override
	public Renta select(Integer id) {
		Renta renta=entityManager.find(Renta.class, id);
		return renta;
	}

	@Override
	public void update(Renta renta) {
		entityManager.merge(renta);

	}

	@Override
	public void delete(Integer id) {
		Renta renta=entityManager.find(Renta.class, id);
		entityManager.remove(renta);
	}

}
