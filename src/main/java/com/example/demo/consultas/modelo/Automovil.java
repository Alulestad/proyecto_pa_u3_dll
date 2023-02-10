package com.example.demo.consultas.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "automovil")
@NamedQuery(name = "Automovil.buscarPorAnio",query = "select e from Automovil e where e.anio = :datoAnio")
@NamedQuery(name = "Automovil.buscarPorMarca",query = "select e from Automovil e where e.marca = :datoMarca")
@NamedQuery(name = "Automovil.buscarPorValuacion",query = "select e from Automovil e where e.valuacion = :datoValuacion")
//@NamedQueries({1..,2..,3..})
@NamedNativeQueries({
	@NamedNativeQuery(name = "Automovil.buscarPorAnioNative",query ="select * from automovil where auto_anio= :datoAnio",resultClass = Automovil.class),
	@NamedNativeQuery(name = "Automovil.buscarPorMarcaNative",query ="select * from automovil where auto_marca= :datoMarca",resultClass = Automovil.class),
	@NamedNativeQuery(name = "Automovil.buscarPorValuacionNative",query ="select * from automovil where auto_valuacion= :datoValuacion",resultClass = Automovil.class)
})
public class Automovil {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="auto_seq",sequenceName = "auto_seq",allocationSize = 1)
	@Column(name="auto_id")
	private Integer id;
	@Column(name="auto_marca")
	private String marca;
	@Column(name="auto_chasis")
	private String chasis;
	@Column(name="auto_placa")
	private String placa;
	@Column(name="auto_anio")
	private Integer anio;
	@Column(name="auto_fecha_matricula")
	private LocalDateTime fecha_matricula;
	@Column(name="auto_valuacion")
	private BigDecimal valuacion;

	
	
	//Get y set
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getChasis() {
		return chasis;
	}
	public void setChasis(String chasis) {
		this.chasis = chasis;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public LocalDateTime getFecha_matricula() {
		return fecha_matricula;
	}
	public void setFecha_matricula(LocalDateTime fecha_matricula) {
		this.fecha_matricula = fecha_matricula;
	}
	public BigDecimal getValuacion() {
		return valuacion;
	}
	public void setValuacion(BigDecimal valuacion) {
		this.valuacion = valuacion;
	}
	
	@Override
	public String toString() {
		return "Automovil [id=" + id + ", marca=" + marca + ", chasis=" + chasis + ", placa=" + placa + ", anio=" + anio
				+ ", fecha_matricula=" + fecha_matricula + ", valuacion=" + valuacion + "]";
	}
	
	

	
}
