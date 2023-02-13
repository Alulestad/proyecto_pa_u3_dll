package com.example.demo.uce.repo;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.DTO.EstudianteDTO;

public interface IEstudianteRepo {

	// query
	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
	public Estudiante buscarPorGeneroQuery(String genero);
	public Estudiante buscarPorCedulaQuery(String cedula);
	public Estudiante buscarPorCiudadQuery(String ciudad);
	
	//Typed query
	public Estudiante buscarPorNombreQueryTyped(String nombre);
	
	//Named query
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	
	//Named Query Typed
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);
	
	//NativeQuery
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	
	//Native Query Typed Named
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);
	
	
	//-------------------------------LISTAS----------------------------------------
	
	
	// query
	public List<Estudiante> buscarPorNombreQueryList(String nombre);
		
	//Named query
	public List<Estudiante> buscarPorNombreNamedQueryList(String nombre);
		
	//Native Query Typed Named
	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre);
	
	
	//-------------------------------LISTAS CON PRIMER ELEMENTO----------------------------------------
	// query
	public Estudiante buscarPorNombreQueryListFistResult(String nombre);
	
	
	//-----------------------------------DTO--------------------------------------------
	//Typed query
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre);
	
	
	//--------------------------------------criteriaAPIquery--------------------------------------
	public Estudiante buscarPorNombreQueryTypedCriteria(String nombre);
	
	public List buscarPorNombreQueryTypedCriteriaAndOr(String nombre,String apellido, String genero);
	
	
	//-------
	public int eliminarPorApellido(String apellido);
	public int actualizarPorApellido(String apellido,String nombre);
	
	
	//con named query
	public int eliminarPorNacimiento(LocalDateTime fecha_nacimiento);
	public int actualizarPorNacimiento(LocalDateTime fecha_nacimiento,String cedula);
	
}
