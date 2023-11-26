package entidad;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int idCliente;
	
	@Column(name="cuit")
	private int cuit;
	@Column(name="razonSocial")
	private String razonSocial;

	@OneToMany(cascade= {CascadeType.ALL})
	@JoinColumn(name="idIncidente")
	private List<Incidente> TIENE = new ArrayList<Incidente>(); 
	

	public Cliente() {

	}

	public Cliente(int idCliente, int cuit, String razonSocial) {
		super();
		this.idCliente = idCliente;
		this.cuit  = cuit;
		this.razonSocial = razonSocial;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

}
