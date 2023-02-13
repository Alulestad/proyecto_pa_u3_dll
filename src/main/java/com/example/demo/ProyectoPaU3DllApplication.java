package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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
import com.example.demo.consultas.modelo.Automovil;
import com.example.demo.consultas.service.IAutomovilService;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.DTO.EstudianteDTO;
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
	
	
	//Automovil
	@Autowired
	private IAutomovilService automovilService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3DllApplication.class, args);
	}
	

	public void runTarea13(String... args) throws Exception {
		/*
		INSERT INTO public.automovil(
	auto_id, auto_anio, auto_chasis, auto_fecha_matricula, auto_marca, auto_placa, auto_valuacion)
	VALUES (1, 2002, 'asdfasdf', '2022-09-22', 'Volkswagen', 'PCI-123', 15000);
	
	INSERT INTO public.automovil(
	auto_id, auto_anio, auto_chasis, auto_fecha_matricula, auto_marca, auto_placa, auto_valuacion)
	VALUES (2, 2003, 'asdgasdg', '2022-08-22', 'Chevrolet', 'PCA-123', 4000);
	
	INSERT INTO public.automovil(
	auto_id, auto_anio, auto_chasis, auto_fecha_matricula, auto_marca, auto_placa, auto_valuacion)
	VALUES (3, 2004, 'asdhasdh', '2022-07-22', 'BMW', 'PCE-123', 7000);
	
	INSERT INTO public.automovil(
	auto_id, auto_anio, auto_chasis, auto_fecha_matricula, auto_marca, auto_placa, auto_valuacion)
	VALUES (4, 2005, 'qwerqwer', '2022-06-22', 'Toyota', 'PCO-123', 17000);
	
	INSERT INTO public.automovil(
	auto_id, auto_anio, auto_chasis, auto_fecha_matricula, auto_marca, auto_placa, auto_valuacion)
	VALUES (5, 2006, 'qwetqwet', '2022-05-22', 'Suzuki', 'PCU-123', 19000);
	
	INSERT INTO public.automovil(
	auto_id, auto_anio, auto_chasis, auto_fecha_matricula, auto_marca, auto_placa, auto_valuacion)
	VALUES (6, 2007, 'qweyqwey', '2022-04-22', 'Hyundai', 'PAU-123', 22000);
	
	INSERT INTO public.automovil(
	auto_id, auto_anio, auto_chasis, auto_fecha_matricula, auto_marca, auto_placa, auto_valuacion)
	VALUES (7, 2007, 'zxcvzxcv', '2022-03-22', 'Hyundai', 'PEU-123', 20000);
		*/
		
		//TypedQuery
		System.out.println("TypedQuery");
		List<Automovil> lista1_automovil = automovilService.buscarPorAnioQueryTyped(2002);
		lista1_automovil.forEach(System.out::println);
		
		List<Automovil> lista2_automovil = automovilService.buscarPorMarcaQueryTyped("Hyundai");
		lista2_automovil.forEach(System.out::println);
		
		List<Automovil> lista3_automovil = automovilService.buscarPorValuacionQueryTyped(new BigDecimal(4000));
		lista3_automovil.forEach(System.out::println);
		
		//NamedQuery
		System.out.println("NamedQuery");
		List<Automovil> lista4_automovil = automovilService.buscarPorAnioNamedQuery(2002);
		lista4_automovil.forEach(System.out::println);
		
		List<Automovil> lista5_automovil = automovilService.buscarPorMarcaNamedQuery("Hyundai");
		lista5_automovil.forEach(System.out::println);
		
		List<Automovil> lista6_automovil = automovilService.buscarPorValuacionNamedQuery(new BigDecimal(4000));
		lista6_automovil.forEach(System.out::println);
		
		//Native Query
		System.out.println("Native Query");
		List<Automovil> lista7_automovil = automovilService.buscarPorAnioNativeQuery(2002);
		lista7_automovil.forEach(System.out::println);
		
		List<Automovil> lista8_automovil = automovilService.buscarPorMarcaNativeQuery("Hyundai");
		lista8_automovil.forEach(System.out::println);
		
		List<Automovil> lista9_automovil = automovilService.buscarPorValuacionNativeQuery(new BigDecimal(4000));
		lista9_automovil.forEach(System.out::println);
		
		
		//Native Query Typed Named
		System.out.println("Native Query Typed Named");
		List<Automovil> lista10_automovil = automovilService.buscarPorAnioNativeQueryTypedNamed(2002);
		lista10_automovil.forEach(System.out::println);
		
		List<Automovil> lista11_automovil = automovilService.buscarPorMarcaNativeQueryTypedNamed("Hyundai");
		lista11_automovil.forEach(System.out::println);
		
		List<Automovil> lista12_automovil = automovilService.buscarPorValuacionNativeQueryTypedNamed(new BigDecimal(4000));
		lista12_automovil.forEach(System.out::println);
		
		
	}
	
	@Override
	public void run(String... args) throws Exception {
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
		
		
		//Native Query Typed Named
		System.out.println("Native Query Typed Named");
		Estudiante estu9=this.estudianteService.buscarPorNombreNativeQueryTypedNamed("Daniel");
		System.out.println(estu9);
		
		//-------------------------------LISTAS----------------------------------------
		// QUERY list
		System.out.println("Query");
		List<Estudiante>  lista1_estu=this.estudianteService.buscarPorNombreQueryList("David");
		lista1_estu.forEach(System.out::println);
		
		//eNamedQueryList
		System.out.println("NamedQueryList");
		List<Estudiante>  lista2_estu=this.estudianteService.buscarPorNombreNamedQueryList("David");
		lista2_estu.forEach(System.out::println);
		
		//NativeQueryTypedNamedList
		System.out.println("NativeQueryTypedNamedList");
		List<Estudiante>  lista3_estu=this.estudianteService.buscarPorNombreNativeQueryTypedNamedList("David");
		lista3_estu.forEach(System.out::println);
		
		
		// Query 
		System.out.println("Query");
		Estudiante estu0=this.estudianteService.buscarPorNombreQueryListFistResult("David");
		System.out.println(estu0);
		
		//Native Query Typed Named DTO
		System.out.println("Native Query Typed Named DTO");
		EstudianteDTO estuDTO10=this.estudianteService.buscarPorNombreQueryTypedDTO("Daniel");
		System.out.println(estuDTO10);
		
		//--------------------------------------criteriaAPIquery--------------------------------------
		System.out.println("criteriaAPIquery");
		Estudiante estu10=this.estudianteService.buscarPorNombreQueryTypedCriteria("Daniel");
		System.out.println(estu10);
		
		System.out.println("criteriaAPIqueryAndOr");
		List<Estudiante> l_estu11=this.estudianteService.buscarPorNombreQueryTypedCriteriaAndOr("Daniel","Molina","M");
		l_estu11.forEach(System.out::println);
		List<Estudiante> l_estu12=this.estudianteService.buscarPorNombreQueryTypedCriteriaAndOr("Daniel","Oña","F");
		l_estu12.forEach(System.out::println);
		
		
		//-------------------------
		System.out.println("-------");
		/*
		System.out.println("actualizar por apellido");
		int b=this.estudianteService.actualizarPorApellido("Molina","Bernardo");
		System.out.println("b: "+b);
		
		System.out.println("Eliminar por apellido");
		int a=this.estudianteService.eliminarPorApellido("Molina");
		System.out.println("a: "+a);*/
		
		System.out.println("-------actualizar (cedula) y eliminar por fecha nacimiento");
		System.out.println("actualizar");
		int numActualizados=this.estudianteService.actualizarPorNacimiento(LocalDateTime.of(1998, 1, 1, 0, 0), "172149");
		System.out.println("Datos actualizados: "+numActualizados);
		
		System.out.println("Eliminar");
		int numEliminados=this.estudianteService.eliminarPorNacimiento(LocalDateTime.of(1998, 1, 1, 0, 0));
		System.out.println("Datos eliminados: "+numEliminados);
		
	}
	
	public void runList(String... args) throws Exception {
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
		Estudiante estu9=this.estudianteService.buscarPorNombreNativeQueryTypedNamed("Daniel");
		System.out.println(estu9);
		
		
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
