package org.Entrega1;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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

    @OneToOne(cascade= {CascadeType.ALL})
    @JoinColumn(name="tecnico_c")
    private Especialidad especialidad;

    public Tecnico() {

    }

    public Tecnico(int idTecnico, String nombre, String apellido) {
        super();
        this.idTecnico = idTecnico;
        this.nombre = nombre;
        this.apellido = apellido;
    }



    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
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
