package hibernate.example;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleApplication {

	private static Logger LOGGER= LoggerFactory.getLogger(ExampleApplication.class);
	
	public static void main(String[] args) {
        AlumnoDao alumnoDao = new AlumnoDao();
        alumnoDao.createAlumno(new Alumno(0, "Jose","Perez"));
        alumnoDao.createAlumno(new Alumno(0, "Esteban","Quito"));
        alumnoDao.createAlumno(new Alumno(0, "Ulrica","Godofreda"));
    
        List <Alumno> alumnos = alumnoDao.getAlumnos();
        LOGGER.info("Todos los Alumnos: {}",alumnos);
        
        Alumno alumnoCorregido  = alumnos.get(1);
        alumnoCorregido.setNombre("Estefano");
        alumnoDao.updateAlumno(alumnoCorregido);
        LOGGER.info("Alumnos corregidos: {}",alumnoDao.getAlumnos());
        
        alumnoDao.removeAlumno(alumnoDao.getAlumnos("Jose","Perez").get(0));
        LOGGER.info("Alumnos filtrados: {}",alumnoDao.getAlumnos());
    }
}
