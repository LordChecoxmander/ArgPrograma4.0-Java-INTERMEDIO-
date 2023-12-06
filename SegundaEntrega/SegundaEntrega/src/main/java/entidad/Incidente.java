package entidad;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import entidad.Cliente;


@Entity
@Table(name="Incidente")
public class Incidente implements Serializable {

    @Id
    @Column(name="idIncidente")
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
    @JoinColumn(name = "idCliente")
    private Cliente idCliente;

    @OneToMany(cascade= {CascadeType.ALL})
    @JoinColumn(name = "idEspecialidad")
    private Especialidad idEspecialidad;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "incidenteXtecnico", joinColumns = {@JoinColumn(name = "idIncidente")},
            inverseJoinColumns = {@JoinColumn(name = "idTecnico")})
    private List<Tecnico> resuelve = new ArrayList<Tecnico>();


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

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public List<Tecnico> getResuelve() {
        return resuelve;
    }

    public void setResuelve(List<Tecnico> resuelve) {
        this.resuelve = resuelve;
    }

    public Especialidad getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Especialidad idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
