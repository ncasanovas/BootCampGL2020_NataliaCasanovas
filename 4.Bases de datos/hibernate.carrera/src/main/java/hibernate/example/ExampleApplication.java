package hibernate.example;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleApplication {

	private static Logger LOGGER= LoggerFactory.getLogger(ExampleApplication.class);
	
	public static void main(String[] args) {
		
		
	
        CompetidorDao competidorDao = new CompetidorDao();
        competidorDao.createCompetidor(new Competidor(2, "Sebastian Loeb"));
        competidorDao.createCompetidor(new Competidor(3, "Marcus Gronholm"));
        competidorDao.createCompetidor(new Competidor(7, "Carlos Sainz"));
        competidorDao.createCompetidor(new Competidor(11, "Petter Solberg"));


        List <Competidor> competidores = competidorDao.getCompetidores();
        LOGGER.info("Todos los : {}",competidores);
  
    }

}

