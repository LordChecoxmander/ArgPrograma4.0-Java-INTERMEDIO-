package frgp.utn.edu.ar.entidad;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

@Entity
public class Docente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private int legajo;
	private String nombre;
	private String apellido;
	
	//PRIMER FORMA DE REALIZARLO:
	
	@OneToOne(cascade= {CascadeType.ALL}) //Tipo de relacion
	@JoinColumn(name="usuario_c")
	private Usuario usuario;
	
	public Docente()
	{}

	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Docente(int legajo, String nombre, String apellido) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
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
		return "Docente [legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario
				+ "]";
	}
	
}
