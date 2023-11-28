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
        Cliente cli1 = new Cliente( 11111111, "RazonUNO");
        Cliente cli2 = new Cliente( 22222222, "RazonDOS");
        Cliente cli3 = new Cliente( 33333333, "RazonTRES");
        Cliente cli4 = new Cliente( 44444444, "RazonCUATRO");
        Cliente cli5 = new Cliente( 55555555, "RazonCINCO");


        /*
         * Creo Especialidades
        */
        Especialidad esp1 = new Especialidad( "NombreUNO", "DescUNO");
        Especialidad esp2 = new Especialidad( "NombreDOS", "DescDOS");
        Especialidad esp3 = new Especialidad( "NombreTRES", "DescTRES");
        Especialidad esp4 = new Especialidad( "NombreCUATRO", "DescCUATRO");
        Especialidad esp5 = new Especialidad( "NombreCINCO", "DescCINCO");


        /*
         * Creo Incidentes
        */
        Incidente in1 = new Incidente(0, "desUNO", 11, LocalDate.of(2023, Month.NOVEMBER, 1), false);
        Incidente in2 = new Incidente(1, "desDOS", 11, LocalDate.of(2023, Month.NOVEMBER, 2), false);
        Incidente in3 = new Incidente(2, "desTRES", 11, LocalDate.of(2023, Month.NOVEMBER, 3), false);
        Incidente in4 = new Incidente(3, "desCUATRO", 11, LocalDate.of(2023, Month.NOVEMBER, 4), false);
        Incidente in5 = new Incidente(4, "desCINCO", 11, LocalDate.of(2023, Month.NOVEMBER, 5), false);


        /*
         * Creo Tecnicos
        */
        Tecnico tec1 = new Tecnico( "NombreUNO", "ApellidoUNO");
        Tecnico tec2 = new Tecnico( "NombreDOS", "ApellidoDOS");
        Tecnico tec3 = new Tecnico( "NombreTRES", "ApellidoTRES");
        Tecnico tec4 = new Tecnico( "NombreCUATRO", "ApellidoCUATRO");
        Tecnico tec5 = new Tecnico( "NombreCINCO", "ApellidoCINCO");

        /*
         * agrego a cada tecnico a una especialidad
         */

        tec1.setIdEspecialidad(esp1);
        tec2.setIdEspecialidad(esp2);
        tec3.setIdEspecialidad(esp3);
        tec4.setIdEspecialidad(esp4);
        tec5.setIdEspecialidad(esp5);

        /*
         * agrego a cada incidente una especialidad
         */

        in1.setIdEspecialidad(esp1);
        in2.setIdEspecialidad(esp2);
        in3.setIdEspecialidad(esp3);
        in4.setIdEspecialidad(esp4);
        in5.setIdEspecialidad(esp5);

        /*
         * agrego a cada incidente un tecnico
         */

        in1.agregarResuelve(tec1);
        in2.agregarResuelve(tec2);
        in3.agregarResuelve(tec3);
        in4.agregarResuelve(tec4);
        in5.agregarResuelve(tec5);


        /*
         * Creo los Dao y agrego los objetos a la BD
         */

        DaoCliente daoCli = new DaoCliente();
        daoCli.Add(cli1);
        daoCli.Add(cli2);
        daoCli.Add(cli3);
        daoCli.Add(cli4);
        daoCli.Add(cli5);

        DaoEspecialidad daoEs = new DaoEspecialidad();
        daoEs.Add(esp1);
        daoEs.Add(esp2);
        daoEs.Add(esp3);
        daoEs.Add(esp4);
        daoEs.Add(esp5);

        DaoIncidente daoIn = new DaoIncidente();
        daoIn.Add(in1);
        daoIn.Add(in2);
        daoIn.Add(in3);
        daoIn.Add(in4);
        daoIn.Add(in5);

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
