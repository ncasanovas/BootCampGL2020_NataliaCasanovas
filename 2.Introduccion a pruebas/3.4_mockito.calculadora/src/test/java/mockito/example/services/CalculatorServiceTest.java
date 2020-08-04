package mockito.example.services;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import junit.framework.Assert;
import mockito.example.services.impl.CalculatorServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

	@InjectMocks
	private CalculatorServiceImpl calculatorServiceImpl;

	@Mock
	DataService dataService;

	private static int[] listaNumeros;

	@BeforeAll
	static void setup() {
		listaNumeros = new int[] { 1, 2, 3, 4, 5 };		
	}

	@Test
	@DisplayName("Test list")
	void tesList() {

		when(dataService.getListOfNumbers()).thenReturn(listaNumeros);
		Assert.assertEquals(3.0, calculatorServiceImpl.calculateAverage(), .01);

	}

}
