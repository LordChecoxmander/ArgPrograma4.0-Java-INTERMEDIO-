package main;



import java.time.LocalDate;
import java.time.Month;

import entidad.Cliente;
import entidad.Especialidad;
import entidad.Incidente;
import entidad.Tecnico;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Creo Cientes
		 */
		Cliente cli1 = new Cliente(0, 11111111, "RazonUNO");
		Cliente cli2 = new Cliente(0, 22222222, "RazonDOS");
		Cliente cli3 = new Cliente(0, 33333333, "RazonTRES");
		Cliente cli4 = new Cliente(0, 44444444, "RazonCUATRO");
		Cliente cli5 = new Cliente(0, 55555555, "RazonCINCO");

		
		/*
		 * Creo Especialidades
		 */
		Especialidad esp1 = new Especialidad(0, "NombreUNO", "DescUNO");
		Especialidad esp2 = new Especialidad(0, "NombreDOS", "DescDOS");
		Especialidad esp3 = new Especialidad(0, "NombreTRES", "DescTRES");
		Especialidad esp4 = new Especialidad(0, "NombreCUATRO", "DescCUATRO");
		Especialidad esp5 = new Especialidad(0, "NombreCINCO", "DescCINCO");
		
		/*
		 * Creo Incidentes
		 */
		Incidente in1 = new Incidente(0, "desUNO", 11, LocalDate.of(2023, Month.NOVEMBER, 1), false);
		Incidente in2 = new Incidente(0, "desDOS", 11, LocalDate.of(2023, Month.NOVEMBER, 2), false);
		Incidente in3 = new Incidente(0, "desTRES", 11, LocalDate.of(2023, Month.NOVEMBER, 3), false);
		Incidente in4 = new Incidente(0, "desCUATRO", 11, LocalDate.of(2023, Month.NOVEMBER, 4), false);
		Incidente in5 = new Incidente(0, "desCINCO", 11, LocalDate.of(2023, Month.NOVEMBER, 5), false);

		
		/*
		 * Creo Tecnicos
		 */
		Tecnico tec1 = new Tecnico(0, "NombreUNO", "ApellidoUNO");
		Tecnico tec2 = new Tecnico(0, "NombreDOS", "ApellidoDOS");
		Tecnico tec3 = new Tecnico(0, "NombreTRES", "ApellidoTRES");
		Tecnico tec4 = new Tecnico(0, "NombreCUATRO", "ApellidoCUATRO");
		Tecnico tec5 = new Tecnico(0, "NombreCINCO", "ApellidoCINCO");
		
		/*
		 * agrego a cada tecnico a una especialidad
		 */
		tec1.setEspecialidad(esp1);
		tec2.setEspecialidad(esp2);
		tec3.setEspecialidad(esp3);
		tec4.setEspecialidad(esp4);
		tec5.setEspecialidad(esp5);
		
		/*
		 * agrego a cada incidente una especialidad
		 */
		in1.setEspecialidad(esp1);
		in2.setEspecialidad(esp2);
		in3.setEspecialidad(esp3);
		in4.setEspecialidad(esp4);
		in5.setEspecialidad(esp5);
		
		/*
		 * agrego a cada incidente un tecnico
		 */
		in1.agregarResuelve(tec1);
		in2.agregarResuelve(tec2);
		in3.agregarResuelve(tec3);
		in4.agregarResuelve(tec4);
		in5.agregarResuelve(tec5);
		
		/*
		 * agrego a cada cliente un incidente
		 */
		cli1.agregarIncidente(in1);
		cli2.agregarIncidente(in2);
		cli3.agregarIncidente(in3);
		cli4.agregarIncidente(in4);
		cli5.agregarIncidente(in5);
	}

}
