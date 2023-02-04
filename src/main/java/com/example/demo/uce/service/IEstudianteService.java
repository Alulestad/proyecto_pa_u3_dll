package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteService {

	
	public Estudiante buscarPorNombre(String nombre);
	public Estudiante buscarPorApellido(String apellido);
	public Estudiante buscarPorGeneroQuery(String genero);
	public Estudiante buscarPorCedulaQuery(String cedula);
	public Estudiante buscarPorCiudadQuery(String ciudad);
	
	//Typed query
	public Estudiante buscarPorNombreQueryTyped(String nombre);
	
	//Named query
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	
	//Named Query Typed
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);
	
	//Native Query
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	
	//Native Query Typed Named
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);
}
