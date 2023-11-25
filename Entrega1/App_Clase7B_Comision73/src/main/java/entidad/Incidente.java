package entidad;

import java.util.Date;

public class Incidente {

	private int idIncidente;
	private String descripcion;
	private int tiempoEstimado;
	private Date fechaResolucion;
	private boolean estado;

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
