package hibernate.menu;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hibernate.example.Competidor;
import hibernate.example.CompetidorDao;
import hibernate.example.ExampleApplication;


public class CompetidorTest {

	Logger LOGGER = LoggerFactory.getLogger(ExampleApplication.class);
	CompetidorDao competidorDao = new CompetidorDao();

	@Test
	void CompetidorCreateTest() {

		competidorDao.createCompetidor(new Competidor(32, "Sebastian Ogier"));
		competidorDao.createCompetidor(new Competidor(45, "Marcus Grönholm"));

		List<Competidor> competidores = competidorDao.getCompetidores();
		LOGGER.info("Todos los : {}", competidores);
	}

	@Test
	void CompetidorGetMenuTest() {

		competidorDao.getCompetidores(22, "Sebastian Ogier");

		List<Competidor> competidores = competidorDao.getCompetidores();
		LOGGER.info("Todos los : {}", competidores);
	}

	@Test
	void CompetidorUpdateTest() {

		competidorDao.createCompetidor(new Competidor(32, "Sebastian Ogier"));
			
		List<Competidor> competidores = competidorDao.getCompetidores();

		Competidor competidorCorregido = competidores.get(0);
		competidorCorregido.setNombreCompetidor("Sebastien Ogier");
		competidorDao.updateCompetidor(competidorCorregido);
		
		LOGGER.info("Competidores corregidos: {}", competidorDao.getCompetidores());
	}

	@Test
	void CompetidorRemoveMenuTest() {
		
		competidorDao.createCompetidor(new Competidor(45, "Marcus Grönholm"));
		
        competidorDao.removeCompetidor(competidorDao.getCompetidores(45, "Marcus Grönholm").get(0));
        
        LOGGER.info("Todos los: {}",competidorDao.getCompetidores());
      
	}
}
