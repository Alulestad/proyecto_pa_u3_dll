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
	/*INSERT INTO public.estudiante(
	estu_id, estu_apellido, estu_cedula, estu_ciudad, estu_fecha_nacimiento, estu_genero, estu_hobie, estu_nombre, estu_pais, estu_salario)
	VALUES (1, 'Molina', '123', 'Sangolquí', '1998-01-01', 'M', 'Dormir', 'Daniel', 'Ecuador', 0);
	INSERT INTO public.estudiante(
	estu_id, estu_apellido, estu_cedula, estu_ciudad, estu_fecha_nacimiento, estu_genero, estu_hobie, estu_nombre, estu_pais, estu_salario)
	VALUES (2, 'Oña', '1234', 'Quito', '2000-01-01', 'M', 'Futbol', 'David', 'Ecuador', 1);
	INSERT INTO public.estudiante(
	estu_id, estu_apellido, estu_cedula, estu_ciudad, estu_fecha_nacimiento, estu_genero, estu_hobie, estu_nombre, estu_pais, estu_salario)
	VALUES (3, 'Lopez', '12345', 'Cayambe', '2001-01-01', 'F', 'Discoteca', 'Maria', 'Ecuador', 2);
	
	*/
	@Override
	public void run(String... args) throws Exception {
		// QUERY
		Estudiante estu1=this.estudianteService.buscarPorApellido("Molina");
		Estudiante estu2=this.estudianteService.buscarPorGeneroQuery("F");
		Estudiante estu3=this.estudianteService.buscarPorCedulaQuery("1234");
		Estudiante estu4=this.estudianteService.buscarPorCiudadQuery("Sangolquí");
		
		System.out.println(estu1);
		System.out.println(estu2);
		System.out.println(estu3);
		System.out.println(estu4);
		
		//TypedQuery
		System.out.println("TypedQuery");
		Estudiante estu5=this.estudianteService.buscarPorNombreQueryTyped("Daniel");

		System.out.println(estu5);
		
		//Named Query
		System.out.println("Named Query");
		Estudiante estu6=this.estudianteService.buscarPorNombreNamedQuery("Daniel");
		System.out.println(estu6);
		
		//Named Query Typed
		System.out.println("Named Query Typed");
		Estudiante estu7=this.estudianteService.buscarPorNombreNamedQueryTyped("Daniel");
		System.out.println(estu7);
		
		//Native Query
		System.out.println("Native Query");
		Estudiante estu8=this.estudianteService.buscarPorNombreNativeQuery("Daniel");
		System.out.println(estu8);
		
		//Native Query Typed Named
		System.out.println("Native Query Typed Named");
		//Estudiante estu9=this.estudianteService.buscarPorNombreNativeQueryTypedNamed("Daniel");
		//System.out.println(estu9);
	}
	
	
	public void runALQUILADORA(String... args) throws Exception {
		
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
