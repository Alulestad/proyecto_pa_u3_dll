package com.example.demo.alquiladora.repo;

import com.example.demo.alquiladora.modelo.Cliente;
import com.example.demo.alquiladora.modelo.Renta;

public interface IRentaRepo {

	//CRUD
	public void insert(Renta renta);
	public Renta select(Integer id);
	public void update(Renta renta);
	public void delete(Integer id);
	
}
