package mockito.example.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.exception.ZeroDivisionException;

import mockito.example.services.impl.CalculatorServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

	@InjectMocks
	private CalculatorServiceImpl calculatorServiceImpl;

	@Mock
	private BasicOperationsService basicOperationsService;

	@Test
	@DisplayName("Ejercicio 3.7")
	void testSuma() {
		when(basicOperationsService.add(3, 2)).thenReturn(5.0);

		Double result = calculatorServiceImpl.calculateSum(3, 2);

		assertEquals("El resultado es: " + result, calculatorServiceImpl.printResult(result));
	}

}
