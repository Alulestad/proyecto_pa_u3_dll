package com.example.demo.uce.repo;

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
	

}
