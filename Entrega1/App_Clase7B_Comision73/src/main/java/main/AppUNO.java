package main;

import java.util.ArrayList;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entidad.Cliente;
import entidad.Incidente;
import entidad.Curso;
import entidad.Tecnico;
import entidad.Usuario;
import frgp.utn.edu.ar.dao.DaoCurso;
import frgp.utn.edu.ar.dao.DaoDocente;

public class AppUNO 
{
    public static void main( String[] args )
    {
	
    	SessionFactory sessionFactory;
    	Configuration configuration = new Configuration();
    	configuration.configure();	
    	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    	sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	Session session = sessionFactory.openSession();
 
    	session.beginTransaction();
 
    
    	/* 
    	 * Creo los usuarios
    	*/
    	Usuario user1 = new Usuario("usuario1","clave1");
    	Usuario user2 = new Usuario("usuario2","clave2");

    	/* Creo el docentes y lo vinculo a un usuario
    	*/
    	
    	Tecnico docente1 = new Tecnico();
    	docente1.setLegajo(9999);
    	docente1.setNombre("Claudio");
    	docente1.setApellido("Fernandez");
    	docente1.setUsuario(user1);
    	
    	/*
    	 * Agrego el docente
    	 */
    	
    	DaoDocente daoDocente = new DaoDocente();
    	daoDocente.Add(docente1);
    	
    	
    	/*
    	 * Creo el curso
    	 */
    	
    	Curso curso1 = new Curso(1, 2020, 1, docente1);
    	
    	/*
    	 * Creo los correos electronicos
    	 */
    
    	Incidente c1 = new Incidente();
    	c1.setDescripcion("jose@gmail.com");
    	
    	Incidente c2 = new Incidente();
    	c2.setDescripcion("jose@hotmail.com");
    
    	ArrayList<Incidente> listaCorreos = new ArrayList<Incidente>();
    	listaCorreos.add(c1);
    	listaCorreos.add(c2);
    	
    	/*
    	 * Agrego los correos electrónicos al alumno Jose
    	 * y creo una lista de alumnos para el curso1
    	 */
    	
    	Cliente al1= new Cliente();
    	al1.setLegajo(1);
    	al1.setNombre("Jose");
    	al1.setApellido("Ferreyra");
    	al1.setListaCorreos(listaCorreos);
    	
    	/*
    	 * Creo la lista de alumnos
    	 */
    
    	HashSet<Cliente> listaAlumnos = new HashSet<Cliente>();
    	listaAlumnos.add(al1);

    	/*
    	 * Vinculo la lista de alumnos al curso. 
    	 */
    	
    	curso1.setListaAlumnos(listaAlumnos);
    	
    	/*
    	 * Como todas las relaciones son en cascada
    	 * al agregar el curso, se agregará todo lo relacionado.
    	 */
    	
    	DaoCurso daoCurso = new DaoCurso();
    	daoCurso.Add(curso1);   	
    }
}
