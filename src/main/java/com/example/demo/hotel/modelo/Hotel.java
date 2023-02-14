package com.example.demo.hotel.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hotel_seq")
	@SequenceGenerator(name = "hotel_seq", sequenceName = "hotel_seq", allocationSize = 1)
	@Column(name = "hotel_id")
	private Integer id;
	@Column(name = "hotel_nombre")
	private String nombre;
	@Column(name = "hotel_direccion")
	private String direccion;
	@Column(name = "hotel_nombrePrimero")
	private String nombrePrimero;
	
	
	//@OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	//@OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
	//@OneToMany(mappedBy = "hotel")
	private List<Habitacion> habitaciones;
	
	
	//G Y S
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
	
	public String getNombrePrimero() {
		return nombrePrimero;
	}
	public void setNombrePrimero(String nombrePrimero) {
		this.nombrePrimero = nombrePrimero;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", nombrePrimero="
				+ nombrePrimero ;//+ ", habitaciones="+ habitaciones + "]";
	}


	
	
	
}
