package entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tecnico")
public class Tecnico {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int idTecnico;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellido;

	public Tecnico() {

	}

	public Tecnico(int idTecnico, String nombre, String apellido) {
		super();
		this.idTecnico = idTecnico;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getIdTecnico() {
		return idTecnico;
	}

	public void setIdTecnico(int idTecnico) {
		this.idTecnico = idTecnico;
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

}
