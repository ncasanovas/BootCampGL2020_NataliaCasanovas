package mockito.example.services;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.services.impl.CalculatorServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

	@InjectMocks
	private CalculatorServiceImpl calculatorServiceImpl;
		

	@Mock
	private BasicOperationsService basicOperationsService;
	
	@ParameterizedTest
	@DisplayName("Ejercicio 3.8")
	@ValueSource(ints = { 2, 4, 8, 20, 60, 200 })
	void testEven(int input) {

		assertTrue(calculatorServiceImpl.isEven(input));

	}

}
