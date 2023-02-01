package com.example.demo.uce.repo;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteRepo {

	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
}
