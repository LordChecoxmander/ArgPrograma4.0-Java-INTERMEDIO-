package frgp.utn.edu.ar.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import frgp.utn.edu.ar.dao.ConfigHibernate;
import frgp.utn.edu.ar.entidad.Alumno;
import frgp.utn.edu.ar.entidad.CorreoElectronico;
import frgp.utn.edu.ar.entidad.Curso;
import frgp.utn.edu.ar.entidad.Docente;
import frgp.utn.edu.ar.entidad.Usuario;

public class App2 {

	public static void main(String[] args) {
		
		ReadInnerJoin();
		//ReadAll_AlgunasColumnas();
		//ReadAll_UnaColumna();
		//ReadUniqueResult_Max();
		//ReadUniqueResult_Docente();
		//leerBidireccion_Usuario_a_Docente();
	}

	public static void leerBidireccion_Usuario_a_Docente()
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
		List<Usuario> listaUsuarios= (List<Usuario>) session.createQuery("FROM Usuario").list();
	    for (Usuario usuario : listaUsuarios) {
	    	//System.out.println(" Usuarios: "+ usuario.getUser()+" "+usuario.getPass()+" "+usuario.getDocente().getLegajo()+ " "+usuario.getDocente().getNombre());	
	    	System.out.println(" Usuarios: "+ usuario.toString()+" ");	
		}
	      ch.cerrarSession();
	}
	
	public static void ReadUniqueResult_Docente()
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		   
        Docente docente = (Docente) session.createQuery("SELECT p FROM Docente p WHERE p.legajo=9999").uniqueResult();
        System.out.println(docente.toString());
        
        ch.cerrarSession();
	}

	public static void ReadUniqueResult_Max()
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		   
      //  Integer maximo = (Integer) session.createQuery("SELECT MAX(id) FROM CorreoElectronico").uniqueResult();
       
        Integer maximo = (Integer) session.createQuery("SELECT MAX(correo.id) FROM CorreoElectronico correo").uniqueResult();
        System.out.println("El Maximo ID es: "+maximo);
        
        ch.cerrarSession();
	}
	
	
	

	public static void ReadAll_UnaColumna()
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		   
        List<String> listaDocentes= (List<String>) session.createQuery("SELECT d.nombre FROM Docente d").list();
        for (String nombre : listaDocentes) {
			System.out.println(nombre);
		} 
        
        ch.cerrarSession();
	}
	
	
	
	public static void ReadAll_AlgunasColumnas()
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
        List<Object[]> listaDocentes= (List<Object[]>) session.createQuery("SELECT d.legajo,d.nombre FROM Docente d").list();
        for (Object[] obj : listaDocentes) {
        	Integer leg = (Integer) obj[0];
			System.out.println(leg+" "+obj[1]);
		} 
        
        ch.cerrarSession();
	}
	
	
	
	public static void ReadClass()
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
        List<Docente> listaDocentes= (List<Docente>) session.createQuery("FROM Docente").list();
        List<Alumno> listaAlumnos= (List<Alumno>) session.createQuery("FROM Alumno").list();
        List<Usuario> listaUsuarios= (List<Usuario>) session.createQuery("FROM Usuario").list();
        List<CorreoElectronico> listaCorreos= (List<CorreoElectronico>) session.createQuery("FROM CorreoElectronico").list();
        List<Curso> listaCursos= (List<Curso>) session.createQuery("FROM Curso").list();
        
        
        System.err.println("Lecturas:");
        
        for (Usuario usuario : listaUsuarios) {
        	  System.out.println(" Usuarios: "+ usuario.toString()+" ");	
		}
    
        for (Docente docente : listaDocentes) {
        	  System.out.println(" Docente: "+ docente.toString()+" ");	
		}
        
        for (CorreoElectronico correos : listaCorreos) {
        	  System.out.println(" Correos: "+ correos.toString()+" ");	
  		}
          
     
        for (Alumno alumno : listaAlumnos) {

        	System.out.println(" Alumnos: "+ alumno.getLegajo()+" - "+alumno.getApellido()+" - "+alumno.getNombre());
        	//System.out.println(" Alumnos: "+ alumno.toString()+" ");	
		}
        
        
        for (Curso curso : listaCursos) {
        	
        	System.out.println(" Curso: "+ curso.getId()+"- "+curso.getAño()+" -"+curso.getComision());
        	//System.out.println(" Cursos: "+ curso.toString()+" ");	
		}
        
        ch.cerrarSession();
	}

	
	public static void ReadInnerJoin()
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		   
    	List<Object[]> listaDocentesUsuarios= (List<Object[]>) session.createQuery("FROM Docente as doc INNER JOIN doc.usuario").list();
        
        System.err.println("Lista de docentes con usuario:");
        
        
        for (Object[] objeto : listaDocentesUsuarios) {
        	
        	Docente docente = (Docente) objeto[0];
        	Usuario usuario = (Usuario) objeto[1];
        	
      	  System.out.println("Docente= Leg:"+docente.getLegajo()+" Nombre:"+docente.getNombre()+" Apellido:"+docente.getApellido()+" Usuario:"+usuario.getUser()+" Contraseña:"+usuario.getPass());	
		}
                
        ch.cerrarSession();
	}

}
