package entidad;

import entidad.Especialidad;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="Tecnico")
public class Tecnico implements Serializable {

    @Id
    @Column(name="idTecnico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTecnico;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;

    @OneToOne(cascade= {CascadeType.ALL})
    @JoinColumn(name="idEspecialidad")
    private Especialidad idEspecialidad;

    public Tecnico() {

    }

    public Tecnico( String nombre, String apellido) {
        super();
//        this.idTecnico = idTecnico;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public Especialidad getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Especialidad idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
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
