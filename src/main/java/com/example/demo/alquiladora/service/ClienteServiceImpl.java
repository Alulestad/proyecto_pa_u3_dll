package com.example.demo.alquiladora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.alquiladora.modelo.Cliente;
import com.example.demo.alquiladora.repo.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepo clienteRepo;
	
	@Override
	public void agregar(Cliente cliente) {
		clienteRepo.insert(cliente);

	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		return clienteRepo.select(cedula);
	}

	@Override
	public void actualizar(Cliente cliente) {
		clienteRepo.update(cliente);

	}

	@Override
	public void eliminar(String cedula) {
		clienteRepo.delete(cedula);

	}

}
