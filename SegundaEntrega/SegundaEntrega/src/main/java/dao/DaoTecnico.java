package dao;

import entidad.Cliente;
import entidad.Tecnico;
import org.hibernate.Session;

public class DaoTecnico {

    public void Add(Tecnico tecnico)
    {
        ConfigHibernate ch = new ConfigHibernate();
        Session session= ch.abrirConexion();

        session.beginTransaction();
        session.save(tecnico);

        session.getTransaction().commit();
        ch.cerrarSession();
    }
}
