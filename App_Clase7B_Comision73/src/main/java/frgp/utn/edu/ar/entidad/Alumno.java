package frgp.utn.edu.ar.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Alumno implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int legajo;
	private String nombre;
	private String apellido;
	
	//Primera forma de realizarlo
	@OneToMany(cascade= {CascadeType.ALL})
	@JoinColumn(name="id_legajo")
	private List<CorreoElectronico> listaCorreos = new ArrayList<CorreoElectronico>(); 
	
	
	public List<CorreoElectronico> getListaCorreos() {
		return listaCorreos;
	}

	public void setListaCorreos(List<CorreoElectronico> listaCorreos) {
		this.listaCorreos = listaCorreos;
	}

	public Alumno(int legajo, String nombre, String apellido) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Alumno()
	{
		
	}


	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", listaCorreos="
				+ listaCorreos + "]";
	}

}
