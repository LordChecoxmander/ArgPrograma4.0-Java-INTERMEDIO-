package entidad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	private LocalDate fechaResolucion;
	@Column(name="estado")
	private boolean estado;

	@OneToMany(cascade= {CascadeType.ALL})
	@JoinColumn(name="idTecnico")
	private List<Tecnico> resuelve = new ArrayList<Tecnico>(); 
	
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="incidente_c")
	private Especialidad especialidad;


	
	public Incidente() {

	}

	public Incidente(int idIncidente, String descripcion, int tiempoEstimado, LocalDate fechaResolucion, boolean estado) {
		super();
		this.idIncidente = idIncidente;
		this.descripcion = descripcion;
		this.tiempoEstimado = tiempoEstimado;
		this.fechaResolucion = fechaResolucion;
		this.estado = estado;
	}

	public void agregarResuelve(Tecnico tec) {
		this.resuelve.add(tec);
	}
	
	public List<Tecnico> getResuelve() {
		return resuelve;
	}

	public void setResuelve(List<Tecnico> resuelve) {
		this.resuelve = resuelve;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public void agregarTecnico(Tecnico tec) {
		this.resuelve.add(tec);
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

	public LocalDate getFechaResolucion() {
		return fechaResolucion;
	}

	public void setFechaResolucion(LocalDate fechaResolucion) {
		this.fechaResolucion = fechaResolucion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
