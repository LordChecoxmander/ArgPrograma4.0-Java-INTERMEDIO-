package frgp.utn.edu.ar.dao;

import org.hibernate.Session;

import frgp.utn.edu.ar.entidad.Alumno;;

public class DaoAlumno {

	public void Add(Alumno alumno)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		     
	    session.beginTransaction();
	    session.save(alumno);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
	
	public Alumno ReadOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		Alumno usuario=(Alumno)session.get(Alumno.class,id);
        
        config.cerrarSession();
        
        return usuario;
	}
	
	public void Update(Alumno alumno)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(alumno);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public void Delete(Alumno alumno)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(alumno);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
}
