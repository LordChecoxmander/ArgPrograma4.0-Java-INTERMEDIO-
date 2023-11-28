package dao;

import entidad.Cliente;
import entidad.Incidente;
import org.hibernate.Session;

public class DaoIncidente {

    public void Add(Incidente incidente)
    {
        ConfigHibernate ch = new ConfigHibernate();
        Session session= ch.abrirConexion();

        session.beginTransaction();
        session.save(incidente);

        session.getTransaction().commit();
        ch.cerrarSession();
    }
}
