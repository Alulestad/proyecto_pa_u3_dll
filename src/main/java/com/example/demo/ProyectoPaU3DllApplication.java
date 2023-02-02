package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.alquiladora.modelo.Cliente;
import com.example.demo.alquiladora.modelo.Renta;
import com.example.demo.alquiladora.modelo.Vehiculo;
import com.example.demo.alquiladora.repo.IClienteRepo;
import com.example.demo.alquiladora.repo.IRentaRepo;
import com.example.demo.alquiladora.repo.IVehiculoRepo;
import com.example.demo.alquiladora.service.IClienteService;
import com.example.demo.alquiladora.service.IRentaService;
import com.example.demo.alquiladora.service.IVehiculoService;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3DllApplication implements CommandLineRunner{

	//UCE
	@Autowired
	private IEstudianteService estudianteService;
	
	//ALQUILADORA
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IRentaService iRentaService;
	@Autowired
	private IVehiculoService iVehiculoService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3DllApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Cliente cliente= new Cliente();
		cliente.setApellido("Molina");
		cliente.setCedula("123");
		cliente.setEdad(25);
		cliente.setEmail("danielito@gmail.com");
		cliente.setNombre("Daniel");
		cliente.setRentas(null);
		
		Vehiculo vehiculo= new Vehiculo();
		vehiculo.setAnio(2004);
		vehiculo.setChasis("abc");
		vehiculo.setMarca("Volkswagen");
		vehiculo.setPlaca("PPP-123");
		vehiculo.setPrecio(new BigDecimal(2000));
		vehiculo.setRenta(null);
		
		
		clienteService.agregar(cliente);
		iVehiculoService.agregar(vehiculo);
		iRentaService.rentar(cliente.getCedula(), vehiculo.getPlaca());

		
	}

	public void runUCE(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estu1=this.estudianteService.buscarPorNombre("Daniel");
		Estudiante estu2=this.estudianteService.buscarPorApellido("Molina");
		
		System.out.println(estu1);
		System.out.println(estu2);
		
	}

}
