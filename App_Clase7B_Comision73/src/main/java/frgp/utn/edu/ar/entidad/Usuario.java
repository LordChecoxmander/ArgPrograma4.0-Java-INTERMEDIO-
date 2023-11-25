package frgp.utn.edu.ar.entidad;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private String user;
	private String pass;
	

   @OneToOne(mappedBy="usuario",fetch=FetchType.EAGER)
	private Docente docente;

	
	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Usuario()
	{}

	public Usuario(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	//SEGUNDA FORMA POSIBLE DE REALIZAR LA RELACION
	//@OneToOne(cascade= {CascadeType.ALL})
	//@JoinColumn(name="legajo_doc")
	//private Docente docente;
	
	/*
	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
    */

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		String mensaje= "Usuario [user=" + user + ", pass=" + pass + ", docente=";
		if(docente!=null)
			mensaje+=docente.getLegajo()+" "+docente.getNombre()+" "+docente.getApellido() + "]";
		return mensaje;
	}

}
