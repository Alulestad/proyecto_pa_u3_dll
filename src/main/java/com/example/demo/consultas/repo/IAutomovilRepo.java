package com.example.demo.consultas.repo;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.consultas.modelo.Automovil;

public interface IAutomovilRepo {

	//TypedQuery
	public List<Automovil> buscarPorAnioQueryTyped(Integer anio);
	public List<Automovil> buscarPorMarcaQueryTyped(String marca);
	public List<Automovil> buscarPorValuacionQueryTyped(BigDecimal valuacion);
	
	//NamedQuery
	public List<Automovil> buscarPorAnioNamedQuery(Integer anio);
	public List<Automovil> buscarPorMarcaNamedQuery(String marca);
	public List<Automovil> buscarPorValuacionNamedQuery(BigDecimal valuacion);
	
	//Native Query
	public List<Automovil> buscarPorAnioNativeQuery(Integer anio);
	public List<Automovil> buscarPorMarcaNativeQuery(String marca);
	public List<Automovil> buscarPorValuacionNativeQuery(BigDecimal valuacion);
	
	//Native Query Typed Named
	public List<Automovil> buscarPorAnioNativeQueryTypedNamed(Integer anio);
	public List<Automovil> buscarPorMarcaNativeQueryTypedNamed(String marca);
	public List<Automovil> buscarPorValuacionNativeQueryTypedNamed(BigDecimal valuacion);

	
	
}
