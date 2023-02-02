package com.example.demo.alquiladora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.alquiladora.modelo.Vehiculo;
import com.example.demo.alquiladora.repo.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	
	@Override
	public void agregar(Vehiculo vehiculo) {
		iVehiculoRepo.insert(vehiculo);

	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return iVehiculoRepo.select(placa);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		iVehiculoRepo.update(vehiculo);

	}

	@Override
	public void eliminar(String placa) {
		iVehiculoRepo.delete(placa);

	}

}
