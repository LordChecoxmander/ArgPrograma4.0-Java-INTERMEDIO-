package dao;


import entidad.Cliente;
import org.hibernate.Session;

public class DaoCliente {

    public void Add(Cliente cliente)
    {
        ConfigHibernate ch = new ConfigHibernate();
        Session session= ch.abrirConexion();

        session.beginTransaction();
        session.save(cliente);

        session.getTransaction().commit();
        ch.cerrarSession();
    }


}
