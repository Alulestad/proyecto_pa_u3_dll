package com.example.demo.alquiladora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.alquiladora.modelo.Cliente;
import com.example.demo.alquiladora.modelo.Renta;
import com.example.demo.alquiladora.modelo.Vehiculo;
import com.example.demo.alquiladora.repo.IRentaRepo;

@Service
public class RentaServiceImpl implements IRentaService {

	@Autowired
	private IRentaRepo iRentaRepo;
	
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Override
	public void agregar(Renta renta) {
		iRentaRepo.insert(renta);

	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return iRentaRepo.select(id);
	}

	@Override
	public void actualizar(Renta renta) {
		iRentaRepo.update(renta);

	}

	@Override
	public void eliminar(Integer id) {
		iRentaRepo.delete(id);

	}
	
	@Override
	public void rentar(String cedula, String placa) {
		Renta renta= new Renta();
		Cliente cliente= clienteService.buscar(cedula);
		Vehiculo vehiculo=iVehiculoService.buscar(placa);
		
		renta.setCliente(cliente);
		renta.setVehiculo(vehiculo);
		
		this.agregar(renta);
		
		//Comprobacion
		Renta rentaEncontrada=this.buscar(renta.getId());
		System.out.println(rentaEncontrada);
		
	}

}
