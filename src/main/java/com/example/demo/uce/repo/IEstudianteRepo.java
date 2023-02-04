package com.example.demo.uce.repo;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteRepo {

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
	
	
	
}
