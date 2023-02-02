package com.example.demo.alquiladora.service;

import com.example.demo.alquiladora.modelo.Vehiculo;

public interface IVehiculoService {

	
	public void agregar(Vehiculo vehiculo);
	public Vehiculo buscar(String placa);
	public void actualizar(Vehiculo vehiculo);
	public void eliminar(String placa);
}
