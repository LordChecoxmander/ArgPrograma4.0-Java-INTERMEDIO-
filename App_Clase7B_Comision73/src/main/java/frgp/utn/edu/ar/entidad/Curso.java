package frgp.utn.edu.ar.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.ManyToAny;

@Entity
public class Curso implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private int año;
	private int comision;
	
	@ManyToOne
	@JoinColumn(name="legajo")
	private Docente docente;

	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="curso_x_alumnos",joinColumns= {@JoinColumn(name="id_curso")}, inverseJoinColumns= {@JoinColumn(name="legajo")})
	private Set<Alumno> listaAlumnos = new HashSet<Alumno>();
	
	
	public Curso()
	{	
	}
	
	
	public Curso(int id, int año, int comision, Docente docente) {
		super();
		this.id = id;
		this.año = año;
		this.comision = comision;
		this.docente = docente;
	}

	
	public Curso(int id, int año, int comision, Docente docente, Set<Alumno> listaAlumnos) {
		super();
		this.id = id;
		this.año = año;
		this.comision = comision;
		this.docente = docente;
		this.listaAlumnos = listaAlumnos;
	}


	public Set<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}


	public void setListaAlumnos(HashSet<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}


	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}


	@Override
	public String toString() {
		return "Curso [id=" + id + ", año=" + año + ", comision=" + comision + ", docente=" + docente
				+ ", listaAlumnos=" + listaAlumnos + "]";
	}

	
}
