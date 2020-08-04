package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;





import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import coverage.loteria.model.CartonGenerator;

@ExtendWith(MockitoExtension.class)

class TestCartonGenerator {

	Random random;

	@Mock
	CartonGenerator cartonGeneratorMock;

	@BeforeEach
	public void setup() {
	    random = Mockito.mock(Random.class);
	    cartonGeneratorMock  = new CartonGenerator();
	}

	@Test
	void CartonGeneratorTest() {

		Loteria loteria = new Loteria(2000, 50, cartonGeneratorMock);
		assertNotNull(cartonGeneratorMock);
		assertNotNull(cartonGeneratorMock.isGanador());

		


	}

	
	
}