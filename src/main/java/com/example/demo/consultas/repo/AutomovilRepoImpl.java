package com.example.demo.consultas.repo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.consultas.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class AutomovilRepoImpl implements IAutomovilRepo {

	@PersistenceContext
	public EntityManager entityManager;
	
	//TypedQuery
	@Override
	public List<Automovil> buscarPorAnioQueryTyped(Integer anio) {
		TypedQuery<Automovil> myTypedQuery=this.entityManager.createQuery("select e from Automovil e where e.anio = :datoAnio", Automovil.class);
		myTypedQuery.setParameter("datoAnio", anio);
		return myTypedQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorMarcaQueryTyped(String marca) {
		TypedQuery<Automovil> myTypedQuery=this.entityManager.createQuery("select e from Automovil e where e.marca = :datoMarca", Automovil.class);
		myTypedQuery.setParameter("datoMarca", marca);
		return myTypedQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorValuacionQueryTyped(BigDecimal valuacion) {
		TypedQuery<Automovil> myTypedQuery=this.entityManager.createQuery("select e from Automovil e where e.valuacion = :datoValuacion", Automovil.class);
		myTypedQuery.setParameter("datoValuacion", valuacion);
		return myTypedQuery.getResultList();
	}

	//NamedQuery
	@Override
	public List<Automovil> buscarPorAnioNamedQuery(Integer anio) {
		Query myQuery=this.entityManager.createNamedQuery("Automovil.buscarPorAnio");
		myQuery.setParameter("datoAnio", anio);
		return myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorMarcaNamedQuery(String marca) {
		Query myQuery=this.entityManager.createNamedQuery("Automovil.buscarPorMarca");
		myQuery.setParameter("datoMarca", marca);
		return myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorValuacionNamedQuery(BigDecimal valuacion) {
		Query myQuery=this.entityManager.createNamedQuery("Automovil.buscarPorValuacion");
		myQuery.setParameter("datoValuacion", valuacion);
		return myQuery.getResultList();
	}

	//Native Query
	@Override
	public List<Automovil> buscarPorAnioNativeQuery(Integer anio) {
		Query myQuery=this.entityManager.createNativeQuery("select * from automovil where auto_anio=:datoAnio",Automovil.class);
		myQuery.setParameter("datoAnio", anio);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorMarcaNativeQuery(String marca) {
		Query myQuery=this.entityManager.createNativeQuery("select * from automovil where auto_marca=:datoMarca",Automovil.class);
		myQuery.setParameter("datoMarca", marca);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorValuacionNativeQuery(BigDecimal valuacion) {
		Query myQuery=this.entityManager.createNativeQuery("select * from automovil where auto_valuacion=:datoValuacion",Automovil.class);
		myQuery.setParameter("datoValuacion", valuacion);
		
		return myQuery.getResultList();
	}

	
	//Native Query Typed Named
	@Override
	public List<Automovil> buscarPorAnioNativeQueryTypedNamed(Integer anio) {
		TypedQuery<Automovil> myQuery=this.entityManager.createNamedQuery("Automovil.buscarPorAnioNative", Automovil.class);
		myQuery.setParameter("datoAnio", anio);
		return myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorMarcaNativeQueryTypedNamed(String marca) {
		TypedQuery<Automovil> myQuery=this.entityManager.createNamedQuery("Automovil.buscarPorMarcaNative", Automovil.class);
		myQuery.setParameter("datoMarca", marca);
		return myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorValuacionNativeQueryTypedNamed(BigDecimal valuacion) {
		TypedQuery<Automovil> myQuery=this.entityManager.createNamedQuery("Automovil.buscarPorValuacionNative", Automovil.class);
		myQuery.setParameter("datoValuacion", valuacion);
		return myQuery.getResultList();
	}

}
