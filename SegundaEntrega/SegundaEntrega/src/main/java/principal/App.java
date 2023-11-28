package principal;

import dao.DaoCliente;
import dao.DaoEspecialidad;
import dao.DaoIncidente;
import dao.DaoTecnico;
import entidad.*;

import java.time.LocalDate;
import java.time.Month;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
         * Creo Cientes
        */
        Cliente cli1 = new Cliente(0, 11111111, "RazonUNO");
        Cliente cli2 = new Cliente(0, 22222222, "RazonDOS");
        Cliente cli3 = new Cliente(0, 33333333, "RazonTRES");
        Cliente cli4 = new Cliente(0, 44444444, "RazonCUATRO");
        Cliente cli5 = new Cliente(0, 55555555, "RazonCINCO");

        DaoCliente daoCli = new DaoCliente();
        daoCli.Add(cli1);
        daoCli.Add(cli2);
        daoCli.Add(cli3);
        daoCli.Add(cli4);
        daoCli.Add(cli5);

        /*
         * Creo Especialidades
        */
        Especialidad esp1 = new Especialidad(0, "NombreUNO", "DescUNO");
        Especialidad esp2 = new Especialidad(0, "NombreDOS", "DescDOS");
        Especialidad esp3 = new Especialidad(0, "NombreTRES", "DescTRES");
        Especialidad esp4 = new Especialidad(0, "NombreCUATRO", "DescCUATRO");
        Especialidad esp5 = new Especialidad(0, "NombreCINCO", "DescCINCO");

        DaoEspecialidad daoEs = new DaoEspecialidad();
        daoEs.Add(esp1);
        daoEs.Add(esp2);
        daoEs.Add(esp3);
        daoEs.Add(esp4);
        daoEs.Add(esp5);

        /*
         * Creo Incidentes
        */
        Incidente in1 = new Incidente(0, "desUNO", 11, LocalDate.of(2023, Month.NOVEMBER, 1), false);
        Incidente in2 = new Incidente(0, "desDOS", 11, LocalDate.of(2023, Month.NOVEMBER, 2), false);
        Incidente in3 = new Incidente(0, "desTRES", 11, LocalDate.of(2023, Month.NOVEMBER, 3), false);
        Incidente in4 = new Incidente(0, "desCUATRO", 11, LocalDate.of(2023, Month.NOVEMBER, 4), false);
        Incidente in5 = new Incidente(0, "desCINCO", 11, LocalDate.of(2023, Month.NOVEMBER, 5), false);

        DaoIncidente daoIn = new DaoIncidente();

        daoIn.Add(in1);
        daoIn.Add(in2);
        daoIn.Add(in3);
        daoIn.Add(in4);
        daoIn.Add(in5);

        /*
         * Creo Tecnicos
        */
        Tecnico tec1 = new Tecnico(0, "NombreUNO", "ApellidoUNO");
        Tecnico tec2 = new Tecnico(0, "NombreDOS", "ApellidoDOS");
        Tecnico tec3 = new Tecnico(0, "NombreTRES", "ApellidoTRES");
        Tecnico tec4 = new Tecnico(0, "NombreCUATRO", "ApellidoCUATRO");
        Tecnico tec5 = new Tecnico(0, "NombreCINCO", "ApellidoCINCO");

        DaoTecnico daoTec = new DaoTecnico();

        daoTec.Add(tec1);
        daoTec.Add(tec2);
        daoTec.Add(tec3);
        daoTec.Add(tec4);
        daoTec.Add(tec5);



        /*
        File hibernatePropsFile = new File("src/main/java/hibernate.cfg.xml");

        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure(hibernatePropsFile);
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);



        Session session = sessionFactory.openSession();

        session.beginTransaction();











        /*
         * agrego a cada tecnico a una especialidad

        tec1.setEspecialidad(esp1);
        tec2.setEspecialidad(esp2);
        tec3.setEspecialidad(esp3);
        tec4.setEspecialidad(esp4);
        tec5.setEspecialidad(esp5);

        /*
         * agrego a cada incidente una especialidad

        in1.setEspecialidad(esp1);
        in2.setEspecialidad(esp2);
        in3.setEspecialidad(esp3);
        in4.setEspecialidad(esp4);
        in5.setEspecialidad(esp5);

        /*
         * agrego a cada incidente un tecnico

        in1.agregarResuelve(tec1);
        in2.agregarResuelve(tec2);
        in3.agregarResuelve(tec3);
        in4.agregarResuelve(tec4);
        in5.agregarResuelve(tec5);

        /*
         * agrego a cada cliente un incidente

        cli1.agregarIncidente(in1);
        cli2.agregarIncidente(in2);
        cli3.agregarIncidente(in3);
        cli4.agregarIncidente(in4);
        cli5.agregarIncidente(in5);

        sessionFactory.close();

         */

    }
}
