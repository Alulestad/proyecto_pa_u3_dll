package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.repo.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepo estudianteRepo;
	
	@Override
	public Estudiante buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQuery(nombre);
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorApellidoQuery(apellido);
	}

	@Override
	public Estudiante buscarPorGeneroQuery(String genero) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorGeneroQuery(genero);
	}

	@Override
	public Estudiante buscarPorCedulaQuery(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorCedulaQuery(cedula);
	}

	@Override
	public Estudiante buscarPorCiudadQuery(String ciudad) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorCiudadQuery(ciudad);
	}

	//Typed query
	@Override
	public Estudiante buscarPorNombreQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryTyped(nombre);
	}

	//Named query
	@Override
	public Estudiante buscarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNamedQuery(nombre);
	}
	//Named Query Typed
	@Override
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNamedQueryTyped(nombre);
	}
	
	//Native Query
	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNativeQuery(nombre);
	}

	//Native Query Typed Named
	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNativeQueryTypedNamed(nombre);
	}
	
}
