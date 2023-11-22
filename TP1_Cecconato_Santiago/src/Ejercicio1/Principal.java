package Ejercicio1;

public class Principal {
	
	public static void main(String[] args) {
		/* 
		 * Se instancie un objeto de tipo Profesor en donde se llene sus
atributos mediante el constructor que tiene los siguientes atributos:
dni, nombre, edad, cantidadMesesTrabajados, cargo y
esProfesorOAyudante (punto 11), mostrar la información del mismo
a través de toString() y también llamar al método
EvaluarCantidadMesesTrabajados()
		 */
		Profesor prof1 = new Profesor(56159753, "carlos", 85, 85, "empleado", true);
		prof1.toString();
		prof1.evaluarCantidadMesesTrabajados();
	
		System.out.println("NO FIJO ----------------------------------");
		
		Profesor prof2 = new Profesor(56159753, "carlos", 1, 1, "empleado", true);
		prof2.evaluarCantidadMesesTrabajados();

		System.out.println("-------------------------------------");
		/*
		 *Se instancia un objeto de tipo Profesor con el constructor vacio. Se
muestre toda su información mediante el método toString() y
además se llame al método
ObtenerInformacionParticularDelTrabajo()
		 */
		 Profesor prof3 = new Profesor();
		 prof3.toString();
		 //como el bool primitivo se inicializa en falso no imprime nada
		 prof3.ObtenerInformacionParticularDelTrabajo();
		 
		
	}
}
