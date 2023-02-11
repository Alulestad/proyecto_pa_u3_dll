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
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
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
		// Query Typed
	@Override
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre) {
		TypedQuery<EstudianteDTO> myTypedQuery=this.entityManager.createQuery("select NEW com.example.demo.uce.modelo.DTO.EstudianteDTO(e.nombre, e.apellido, e.cedula,e.genero) from Estudiante e where e.nombre = :datoNombre", EstudianteDTO.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	
	//--------------------------------------criteriaAPIquery--------------------------------------
	@Override
	public Estudiante buscarPorNombreQueryTypedCriteria(String nombre) {
		CriteriaBuilder myBuilder=this.entityManager.getCriteriaBuilder(); //LA FABRICA
		
		//Especificamos el tipo de retorno de mi query
		CriteriaQuery<Estudiante> myQuery =myBuilder.createQuery(Estudiante.class); //ESPECIFICAMOS EL TIPO DE RETORNO
		
		//AQUI EMPEZAMOS A CREAR  EL SQL
		//Definiendo el FROM-Root 
		Root<Estudiante> miTablaFrom=myQuery.from(Estudiante.class); //==from estudiante
		
		//Las condiciones where se conocen en criteriaAPIquery como predicados 
		//conidcion en equals:  e.nombre=:datoNombre en el primer atributo
		Predicate condicion1=myBuilder.equal(miTablaFrom.get("nombre"), nombre);
		
		myQuery.select(miTablaFrom).where(condicion1);
		//declarado/armado query
		
		//la ejecucion del query la realizamos con cualquier tipo ya conocido: TypeQuery
		TypedQuery<Estudiante> mySQL= this.entityManager.createQuery(myQuery);
		
		
		return mySQL.getSingleResult();
	}

	@Override
	public List buscarPorNombreQueryTypedCriteriaAndOr(String nombre,String apellido, String genero) {
		
		CriteriaBuilder myBuilder=this.entityManager.getCriteriaBuilder(); //LA FABRICA
		
		CriteriaQuery<Estudiante> myQuery =myBuilder.createQuery(Estudiante.class); //ESPECIFICAMOS EL TIPO DE RETORNO
		
		Root<Estudiante> miTablaFrom=myQuery.from(Estudiante.class); //==from estudiante
		
		
		//M: e.nombre= AND e.apellido
		//F: e.nombre= OR e.apellido
		
		//creamos los predicados
		//predicado por nombre
		Predicate p1=myBuilder.equal(miTablaFrom.get("nombre"), nombre); //en el get estamos en objetos
		//predicado por apellido
		Predicate p2=myBuilder.equal(miTablaFrom.get("apellido"), apellido);
		
		
		Predicate predicadoFinal=null;
		if (genero.equals("M")) {
			//predicado AND
			predicadoFinal=myBuilder.and(p1,p2);
		}else {
			//predicado OR
			predicadoFinal=myBuilder.or(p1,p2);
		}
		
		
		myQuery.select(miTablaFrom).where(predicadoFinal);
		
		TypedQuery<Estudiante> mySQL= this.entityManager.createQuery(myQuery);
		
		
		return mySQL.getResultList();
		
		
		
	}

	
	
	
	

}
