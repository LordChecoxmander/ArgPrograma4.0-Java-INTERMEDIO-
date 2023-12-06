package org.Entrega1;


import jakarta.persistence.*;

@Entity
@Table(name="especialidad")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecialidad;

    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripción;

    public Especialidad() {

    }

    public Especialidad(int idEspecialidad, String nombre, String descripción) {
        super();
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
        this.descripción = descripción;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

}
