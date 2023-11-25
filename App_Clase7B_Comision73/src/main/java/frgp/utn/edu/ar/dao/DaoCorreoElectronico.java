package frgp.utn.edu.ar.dao;

import org.hibernate.Session;

import frgp.utn.edu.ar.entidad.CorreoElectronico;


public class DaoCorreoElectronico {

	public void Add(CorreoElectronico correo)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		     
	    session.beginTransaction();
	    session.save(correo);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
	
	public CorreoElectronico ReadOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		CorreoElectronico usuario=(CorreoElectronico)session.get(CorreoElectronico.class,id);
        
        config.cerrarSession();
        
        return usuario;
	}
	
	public void Update(CorreoElectronico correo)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(correo);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public void Delete(CorreoElectronico correo)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(correo);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
}
