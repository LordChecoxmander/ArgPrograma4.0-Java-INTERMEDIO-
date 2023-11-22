package Ejercicio1;

public class Profesor extends Empleado{
	
	private String cargo;
	private boolean esProfesorOAyudante; //true si es Profesor
	
	
	public Profesor() {
		super();
	}
	
	public Profesor(int dni,String nombre,int edad,
			int cantidadMesesTrabajados,String cargo, boolean esProfesorOAyudante) {
		
		super(dni, nombre, edad, cantidadMesesTrabajados);
		this.cargo = cargo;
		this.esProfesorOAyudante = esProfesorOAyudante;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Boolean getEsProfesorOAyudante() {
		return esProfesorOAyudante;
	}
	public void setEsProfesorOAyudante(Boolean esProfesorOAyudante) {
		this.esProfesorOAyudante = esProfesorOAyudante;
	}
	
	public void ObtenerInformacionParticularDelTrabajo() {
		if(esProfesorOAyudante) {
			System.out.println("Los profesores suelen trabajar dando sclases en secundarios, terciarios o universitarios");
		}
	}
}
