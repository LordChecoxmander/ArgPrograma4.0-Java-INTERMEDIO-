package entidad;

public class Tecnico {

	private int idTecnico;
	private String nombre;
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
