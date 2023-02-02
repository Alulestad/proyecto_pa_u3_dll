package com.example.demo.alquiladora.repo;

import com.example.demo.alquiladora.modelo.Cliente;

public interface IClienteRepo {
	
	//CRUD
	public void insert(Cliente cliente);
	public Cliente select(String cedula);
	public void update(Cliente cliente);
	public void delete(String cedula);
	
	
}
