package mockito.example.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.services.impl.BasicOperationsServiceImpl;
import mockito.example.services.impl.CalculatorServiceImpl;
import mockito.example.services.impl.DataServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

	@InjectMocks
	private CalculatorServiceImpl calculatorServiceImpl;

	@Mock
	private BasicOperationsService basicOperationsService;

	
	
	@Test
	@DisplayName("Ejercicio 3.10")
	void testSpy() {

		DataServiceImpl dataServiceImpl = new DataServiceImpl();
		DataServiceImpl spy = Mockito.spy(dataServiceImpl);
		calculatorServiceImpl.setDataService(spy);

		when(spy.getListOfNumbers()).thenReturn( new int[] {1, 3, 7, 20, 25});

		spy.setListOfNumbers(new int [] {2, 8});
		
		assertTrue(spy.getListOfNumbers().length == 5);
		
	}

}