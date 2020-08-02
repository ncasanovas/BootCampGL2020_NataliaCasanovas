package coverage.example.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class PlanetTest {

	@Test
	void testMain() {
		
		Planet planet = new Planet();
		planet.setName("Tierra");
		
		
			
		assertNotNull(planet.getName());
		
	}

}