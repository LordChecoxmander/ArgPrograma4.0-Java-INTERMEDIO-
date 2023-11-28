package entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable {

    @Id
    @Column(name="idCliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    @Column(name="cuit")
    private int cuit;
    @Column(name="razonSocial")
    private String razonSocial;




    public Cliente() {

    }

    public Cliente( int cuit, String razonSocial) {
        super();
//        this.idCliente = idCliente;
        this.cuit  = cuit;
        this.razonSocial = razonSocial;
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
