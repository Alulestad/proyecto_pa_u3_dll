package com.example.demo.alquiladora.repo;

import com.example.demo.alquiladora.modelo.Renta;
import com.example.demo.alquiladora.modelo.Vehiculo;

public interface IVehiculoRepo {

	//CRUD
	public void insert(Vehiculo vehiculo);
	public Vehiculo select(String placa);
	public void update(Vehiculo vehiculo);
	public void delete(String placa);
	
}
