package coverage.example.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;





class StarTest {

	
	@Test
	void testMain() {
		
		
		Star star = new Star();
		star.setName("Centauri");
		
		Planet planet = new Planet();
		planet.setName("Tierra");
		
		List<Planet> planets = new ArrayList<Planet>();
		planets.add(0, planet);
		
		star.setPlanets(planets);

		
		assertNotNull(star.getName());
		assertNotNull(planets.get(0));
		assertNotNull(star.getPlanets());
	
		
		
	}

}
