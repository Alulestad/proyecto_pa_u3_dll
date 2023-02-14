package com.example.demo.hotel.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.hotel.modelo.Habitacion;
import com.example.demo.hotel.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HotelRepoImpl implements IHotelRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub+
		//select * from hotel h join habitacion ha on h.hote_id=ha.habi_id_hotel
		//debemos hacer enr eferencia a la relacion de la tabla principal
		//en nuestro ejemplo la relacion de hotel es las habitaciones (tiene tambien habi_id_hotel que es la relaciones)
		// no necesito especificar la igualacion del on, porque intrinsecamente havitaciones ya la contiene
		//TypedQuery<Hotel> myQuery=this.entityManager.createQuery("SELECT h FROM Hotel h INNER JOIN h.habitaciones ha "
				//+ "WHERE ha.tipo=:datoTipo",Hotel.class);
		
		TypedQuery<Hotel> myQuery=this.entityManager.createQuery("SELECT h FROM Hotel h JOIN h.habitaciones ha "
				+ "WHERE ha.tipo=:datoTipo",Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		
		List <Hotel> listaHoteles=myQuery.getResultList();
		//BAJO DEMANDA
		for (Hotel h:listaHoteles) {
			List<Habitacion> listaTMP=new ArrayList<>();
			for(Habitacion ha:h.getHabitaciones()) {
				if(ha.getTipo().equals(tipoHabitacion)) {
					listaTMP.add(ha);
				}
			}
			h.setHabitaciones(listaTMP);
			
		}
	
		
		return listaHoteles;
	}


	@Override
	public List<Hotel> buscarHotelOuterRightJoin(String tipoHabitacion) {
		TypedQuery<Hotel> myQuery=this.entityManager.createQuery("SELECT h FROM Hotel h RIGHT JOIN h.habitaciones ha "
				+ "WHERE ha.tipo=:datoTipo",Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		
		List <Hotel> listaHoteles=myQuery.getResultList();
		
		/*for (Hotel h:listaHoteles) {
			h.getHabitaciones().size();
		}*/
		
		return listaHoteles;
	}

	@Override
	public List<Hotel> buscarHotelOuterLeftJoin(String tipoHabitacion) {
		TypedQuery<Hotel> myQuery=this.entityManager.createQuery("SELECT h FROM Hotel h LEFT JOIN h.habitaciones ha "
				+ "WHERE ha.tipo=:datoTipo",Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		
		List <Hotel> listaHoteles=myQuery.getResultList();
		for (Hotel h:listaHoteles) {
			h.getHabitaciones().size();
		}
		
		return listaHoteles;
	}

	@Override
	public List<Hotel> buscarHotelOuterFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Hotel> buscarHotelJoinFetch(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

}
