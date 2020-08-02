package coverage.loteria;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;




import coverage.loteria.model.CartonGenerator;

class LoteriaTest {

	private static final CartonGenerator cartonGenerator = new CartonGenerator();
	
	@BeforeAll
	public static void init() {
		System.out.println("Antes de los metodos");
	}
	
	@AfterAll
	public static void tearDown() {
		System.out.println("Despues de los metodos");
	}
	
	@Test
	@DisplayName(value = "Test loteria")
	void test() {
		
		Loteria loteria = new Loteria(2000, 50, cartonGenerator);
		
		assertNotNull(loteria);
		assertTrue(loteria.getPozo() == 2000);
		assertTrue(loteria.getBoletos() == 50);
		assertNotNull(loteria.getGanadores());
		cartonGenerator.isGanador();
		loteria.jugada();
		assertNotNull(loteria.hayGanadorUnico());
		assertFalse(loteria.hayCuadrupleGanador());

		
	}
	
}
