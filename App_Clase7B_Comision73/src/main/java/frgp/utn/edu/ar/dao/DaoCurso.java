package frgp.utn.edu.ar.dao;

import org.hibernate.Session;

import frgp.utn.edu.ar.entidad.Curso;


public class DaoCurso {

	public void Add(Curso curso)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		     
	    session.beginTransaction();
	    session.save(curso);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
	
	public Curso ReadOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		Curso usuario=(Curso)session.get(Curso.class,id);
        
        config.cerrarSession();
        
        return usuario;
	}
	
	public void Update(Curso curso)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(curso);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public void Delete(Curso curso) //Este usuario tiene que venir cargado el ID del usuario que se quiere eliminar
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(curso);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
}
