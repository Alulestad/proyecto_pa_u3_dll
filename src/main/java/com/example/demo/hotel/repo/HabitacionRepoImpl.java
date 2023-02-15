package com.example.demo.hotel.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.hotel.modelo.Habitacion;
import com.example.demo.hotel.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HabitacionRepoImpl implements IHabitacionRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Habitacion> buscarHabitacionOuterRightJoin() {
		TypedQuery<Habitacion> myQuery=this.entityManager.createQuery("SELECT ha FROM Hotel h RIGHT JOIN h.habitaciones ha ",Habitacion.class);
		
		List <Habitacion> listaHa=myQuery.getResultList();

		
		return listaHa;

	}

	@Override
	public List<Habitacion> buscarHabitacionOuterLeftJoin() {
		TypedQuery<Habitacion> myQuery=this.entityManager.createQuery("SELECT ha FROM Hotel h LEFT JOIN h.habitaciones ha ",Habitacion.class);
		
		List <Habitacion> listaHa=myQuery.getResultList();
//		for(Hotel h:listaHoteles) {
//			h.getHabitaciones().size();
//		}
		
		return listaHa;
	}

	@Override
	public List<Habitacion> buscarHabitacionOuterFullJoin() {
		
		return null;
	}
	

}
