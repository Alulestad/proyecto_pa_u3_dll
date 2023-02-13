package com.example.demo.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.DTO.EstudianteDTO;
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

	//-------------------------------LISTAS----------------------------------------
	// query
	@Override
	public List<Estudiante> buscarPorNombreQueryList(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryList(nombre);
	}

	//Named query
	@Override
	public List<Estudiante> buscarPorNombreNamedQueryList(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNamedQueryList(nombre);
	}

	//Native Query Typed Named
	@Override
	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNativeQueryTypedNamedList(nombre);
	}

	//-------------------------------LISTAS CON PRIMER ELEMENTO----------------------------------------
		// query
	@Override
	public Estudiante buscarPorNombreQueryListFistResult(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryListFistResult(nombre);
	}

	//-----------------------------------DTO--------------------------------------------
	//Typed query
	@Override
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryTypedDTO(nombre);
	}

	
	//--------------------------------------criteriaAPIquery--------------------------------------
	@Override
	public Estudiante buscarPorNombreQueryTypedCriteria(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryTypedCriteria(nombre);
	}


	@Override
	public List buscarPorNombreQueryTypedCriteriaAndOr(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryTypedCriteriaAndOr(nombre, apellido, genero);
	}

	
	//-------
	@Override
	public int eliminarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.eliminarPorApellido(apellido);
	}

	@Override
	public int actualizarPorApellido(String apellido, String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.actualizarPorApellido(apellido,nombre);
	}

	//con named query
	@Override
	public int eliminarPorNacimiento(LocalDateTime fecha_nacimiento) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.eliminarPorNacimiento(fecha_nacimiento);
	}

	@Override
	public int actualizarPorNacimiento(LocalDateTime fecha_nacimiento, String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.actualizarPorNacimiento(fecha_nacimiento, cedula);
	}
	
}
