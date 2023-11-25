package frgp.utn.edu.ar.dao;

import org.hibernate.Session;

import frgp.utn.edu.ar.entidad.Docente;

public class DaoDocente {

	public void Add(Docente docente)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		     
	    session.beginTransaction();
	    session.save(docente);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
	
	public Docente ReadOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		Docente usuario=(Docente)session.get(Docente.class,id);
        
        config.cerrarSession();
        
        return usuario;
	}
	
	public void Update(Docente docente)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(docente);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public void Delete(Docente docente)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(docente);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
}
