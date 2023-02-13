package com.example.demo.consultas.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.consultas.modelo.Automovil;
import com.example.demo.consultas.repo.IAutomovilRepo;

@Service
public class AutomovilServiceImpl implements IAutomovilService {

	@Autowired
	private IAutomovilRepo automovilRepo;
	
	//TypedQuery
	@Override
	public List<Automovil> buscarPorAnioQueryTyped(Integer anio) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorAnioQueryTyped(anio);
	}

	@Override
	public List<Automovil> buscarPorMarcaQueryTyped(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorMarcaQueryTyped(marca);
	}

	@Override
	public List<Automovil> buscarPorValuacionQueryTyped(BigDecimal valuacion) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorValuacionQueryTyped(valuacion);
	}

	
	//NamedQuery
	@Override
	public List<Automovil> buscarPorAnioNamedQuery(Integer anio) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorAnioNamedQuery(anio);
	}

	@Override
	public List<Automovil> buscarPorMarcaNamedQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorMarcaNamedQuery(marca);
	}

	@Override
	public List<Automovil> buscarPorValuacionNamedQuery(BigDecimal valuacion) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorValuacionNamedQuery(valuacion);
	}

	//Native Query
	@Override
	public List<Automovil> buscarPorAnioNativeQuery(Integer anio) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorAnioNativeQuery(anio);
	}

	@Override
	public List<Automovil> buscarPorMarcaNativeQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorMarcaNativeQuery(marca);
	}

	@Override
	public List<Automovil> buscarPorValuacionNativeQuery(BigDecimal valuacion) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorValuacionNativeQuery(valuacion);
	}

	//Native Query Typed Named
	@Override
	public List<Automovil> buscarPorAnioNativeQueryTypedNamed(Integer anio) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorAnioNativeQueryTypedNamed(anio);
	}

	@Override
	public List<Automovil> buscarPorMarcaNativeQueryTypedNamed(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorMarcaNativeQueryTypedNamed(marca);
	}

	@Override
	public List<Automovil> buscarPorValuacionNativeQueryTypedNamed(BigDecimal valuacion) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorValuacionNativeQueryTypedNamed(valuacion);
	}

	//------- Eliminacion con anio y actualizacion(valuacion) con chasis -------con named query
	@Override
	public int eliminarPorAnio(Integer anio) {
		
		return this.automovilRepo.eliminarPorAnio(anio);
	}

	@Override
	public int actualizarPorChasis(String chasis, BigDecimal valuacion) {

		return this.automovilRepo.actualizarPorChasis(chasis, valuacion);
	}

}
