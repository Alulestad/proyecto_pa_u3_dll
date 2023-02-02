package com.example.demo.alquiladora.service;

import com.example.demo.alquiladora.modelo.Renta;

public interface IRentaService {

	
	public void agregar(Renta renta);
	public Renta buscar(Integer id);
	public void actualizar(Renta renta);
	public void eliminar(Integer id);
	
	public void rentar(String cedula, String placa);
}
