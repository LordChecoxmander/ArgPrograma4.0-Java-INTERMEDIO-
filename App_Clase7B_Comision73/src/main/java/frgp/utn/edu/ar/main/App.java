package frgp.utn.edu.ar.main;

import java.util.ArrayList;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import frgp.utn.edu.ar.dao.DaoCurso;
import frgp.utn.edu.ar.dao.DaoDocente;
import frgp.utn.edu.ar.entidad.Alumno;
import frgp.utn.edu.ar.entidad.CorreoElectronico;
import frgp.utn.edu.ar.entidad.Curso;
import frgp.utn.edu.ar.entidad.Docente;
import frgp.utn.edu.ar.entidad.Usuario;

public class App 
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
    	
    	Docente docente1 = new Docente();
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
    
    	CorreoElectronico c1 = new CorreoElectronico();
    	c1.setDescripcion("jose@gmail.com");
    	
    	CorreoElectronico c2 = new CorreoElectronico();
    	c2.setDescripcion("jose@hotmail.com");
    
    	ArrayList<CorreoElectronico> listaCorreos = new ArrayList<CorreoElectronico>();
    	listaCorreos.add(c1);
    	listaCorreos.add(c2);
    	
    	/*
    	 * Agrego los correos electrónicos al alumno Jose
    	 * y creo una lista de alumnos para el curso1
    	 */
    	
    	Alumno al1= new Alumno();
    	al1.setLegajo(1);
    	al1.setNombre("Jose");
    	al1.setApellido("Ferreyra");
    	al1.setListaCorreos(listaCorreos);
    	
    	/*
    	 * Creo la lista de alumnos
    	 */
    
    	HashSet<Alumno> listaAlumnos = new HashSet<Alumno>();
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
