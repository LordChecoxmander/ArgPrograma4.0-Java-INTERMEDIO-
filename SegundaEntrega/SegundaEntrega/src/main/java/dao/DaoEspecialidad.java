package dao;

import entidad.Cliente;
import entidad.Especialidad;
import org.hibernate.Session;

public class DaoEspecialidad {

    public void Add(Especialidad especialidad)
    {
        ConfigHibernate ch = new ConfigHibernate();
        Session session= ch.abrirConexion();

        session.beginTransaction();
        session.save(especialidad);

        session.getTransaction().commit();
        ch.cerrarSession();
    }

}
