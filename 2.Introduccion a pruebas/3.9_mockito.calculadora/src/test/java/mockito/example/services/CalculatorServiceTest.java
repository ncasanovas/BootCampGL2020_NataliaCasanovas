package mockito.example.services;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.services.impl.BasicOperationsServiceImpl;
import mockito.example.services.impl.CalculatorServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

	@InjectMocks
	private CalculatorServiceImpl calculatorServiceImpl;

	@Mock
	private BasicOperationsService basicOperationsService;

	@Test
	@DisplayName("Ejercicio 3.8")
	void testSpy() {

		BasicOperationsService basicOperationsService = new BasicOperationsServiceImpl();
		BasicOperationsService spy = Mockito.spy(basicOperationsService);
		calculatorServiceImpl.setBasicOperationsService(spy);

		calculatorServiceImpl.calculateSum(3, 5);

		verify(spy).add(3.0, 5.0);
	}

}
