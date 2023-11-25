package entidad;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Incidente")
public class Incidente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idIncidente;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="tiempoEstimado")
	private int tiempoEstimado;
	@Column(name="fechaResolucion")
	private Date fechaResolucion;
	@Column(name="estado")
	private boolean estado;

	@OneToMany(cascade= {CascadeType.ALL})
	@JoinColumn(name="idTecnico")
	private List<Tecnico> resuelve = new ArrayList<Tecnico>(); 
	
	public Incidente() {

	}

	public Incidente(int idIncidente, String descripcion, int tiempoEstimado, Date fechaResolucion, boolean estado) {
		super();
		this.idIncidente = idIncidente;
		this.descripcion = descripcion;
		this.tiempoEstimado = tiempoEstimado;
		this.fechaResolucion = fechaResolucion;
		this.estado = estado;
	}

	public int getIdIncidente() {
		return idIncidente;
	}

	public void setIdIncidente(int idIncidente) {
		this.idIncidente = idIncidente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getTiempoEstimado() {
		return tiempoEstimado;
	}

	public void setTiempoEstimado(int tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}

	public Date getFechaResolucion() {
		return fechaResolucion;
	}

	public void setFechaResolucion(Date fechaResolucion) {
		this.fechaResolucion = fechaResolucion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
