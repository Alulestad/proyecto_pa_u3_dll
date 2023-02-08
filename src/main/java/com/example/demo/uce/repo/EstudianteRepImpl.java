package com.example.demo.uce.repo;

import java.util.List;

import org.hibernate.boot.jaxb.mapping.NamedQuery;
import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.DTO.EstudianteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepImpl implements IEstudianteRepo {
	
	@PersistenceContext
	public EntityManager entityManager;

	
	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		// TODO Auto-generated method stub
		//select * from estudiante where estu_nombre='Daniel'
		//select e from Estudiante e where e.nombre = :datoNombre ...'Daniel'
		Query jpqlQuery=this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre",nombre);
		
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		Query jpqlQuery=this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido");
		jpqlQuery.setParameter("datoApellido",apellido);
		
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorGeneroQuery(String genero) {
		Query jpqlQuery=this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
		jpqlQuery.setParameter("datoGenero",genero);
		
		return (Estudiante) jpqlQuery.getSingleResult();

	}

	@Override
	public Estudiante buscarPorCedulaQuery(String cedula) {
		Query jpqlQuery=this.entityManager.createQuery("select e from Estudiante e where e.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula",cedula);
		
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCiudadQuery(String ciudad) {
		Query jpqlQuery=this.entityManager.createQuery("select e from Estudiante e where e.ciudad = :datoCiudad");
		jpqlQuery.setParameter("datoCiudad",ciudad);
		
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	//Typed Query
	@Override
	public Estudiante buscarPorNombreQueryTyped(String nombre) {
		// TODO Auto-generated method stub
		//TypedQuery<Estudiante> myTypedQuery=this.entityManager.createQuery("JPQL", Estudiante.class);
		TypedQuery<Estudiante> myTypedQuery=this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	
	//named Query
	@Override
	public Estudiante buscarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery=this.entityManager.createNamedQuery("Estudiante.buscarPorNom");
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante)myQuery.getSingleResult();
	}

	
	//Named Typed Query
	@Override
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre) {
		TypedQuery<Estudiante> myTypedQuery=this.entityManager.createNamedQuery("Estudiante.buscarPorNom", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	//Native Query
	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		
		Query myQuery=this.entityManager.createNativeQuery("select * from estudiante where estu_nombre=:datoNombre",Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		
		return (Estudiante) myQuery.getSingleResult();
	}

	//Native Query Typed Named
	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
		TypedQuery<Estudiante> myQuery=this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	//-------------------------------LISTAS----------------------------------------
	// query
	@Override
	public List<Estudiante> buscarPorNombreQueryList(String nombre) {
		Query jpqlQuery=this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre",nombre);
		
		return jpqlQuery.getResultList();
	}

	//Named query
	@Override
	public List<Estudiante> buscarPorNombreNamedQueryList(String nombre) {
		Query myQuery=this.entityManager.createNamedQuery("Estudiante.buscarPorNom");
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getResultList();
	}

	//Native Query Typed Named
	@Override
	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre) {
		TypedQuery<Estudiante> myQuery=this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getResultList();
	}

	//-------------------------------LISTAS CON PRIMER ELEMENTO----------------------------------------
	// query
	@Override
	public Estudiante buscarPorNombreQueryListFistResult(String nombre) {
		Query jpqlQuery=this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre",nombre);
		
		return (Estudiante) jpqlQuery.getResultList().get(0);
	}

	
	//-----------------------------------DTO--------------------------------------------
		//Named Query Typed
	@Override
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre) {
		TypedQuery<EstudianteDTO> myTypedQuery=this.entityManager.createQuery("select NEW EstudianteDTO(e.nombre, e.apellido, e.cedula) from Estudiante e where e.nombre = :datoNombre", EstudianteDTO.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	
	
	
	

}
