package com.example.demo.alquiladora.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "renta")
public class Renta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_rent")
	@SequenceGenerator(name = "seq_rent",sequenceName = "seq_rent",allocationSize = 1)
	@Column(name = "rent_id")
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "rent_id_cliente")
	public Cliente cliente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "rent_id_vehiculo")
	public Vehiculo vehiculo;
	
	
	//Gets y sets

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Renta [id=" + id + ", cliente=" + cliente + ", vehiculo=" + vehiculo + "]";
	}
	
	
	
}
