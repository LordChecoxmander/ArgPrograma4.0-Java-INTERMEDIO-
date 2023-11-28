package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.io.File;

public class ConfigHibernate {

    private SessionFactory sessionFactory;
    private Session session;

    public ConfigHibernate()
    {
        File hibernatePropsFile = new File("src/main/java/hibernate.cfg.xml");
        Configuration configuration = new Configuration();
        configuration.configure(hibernatePropsFile);
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }

    public Session abrirConexion()
    {
        session=sessionFactory.openSession();
        return session;
    }

    public void cerrarSession()
    {
        session.close();
        cerrarSessionFactory();
    }


    public void cerrarSessionFactory()
    {
        sessionFactory.close();
    }
}
