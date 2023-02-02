package com.example.demo.alquiladora.repo;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.alquiladora.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ClienteRepoImpl implements IClienteRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insert(Cliente cliente) {
		entityManager.persist(cliente);

	}

	@Override
	public Cliente select(String cedula) {
		Cliente cliente= entityManager.find(Cliente.class, cedula);
		return cliente;
	}

	@Override
	public void update(Cliente cliente) {
		entityManager.merge(cliente);
	}

	@Override
	public void delete(String cedula) {
		Cliente cliente= entityManager.find(Cliente.class, cedula);
		entityManager.remove(cliente);

	}

}
