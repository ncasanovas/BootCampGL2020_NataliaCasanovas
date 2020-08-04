package mockito.example.services;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
	CalculatorServiceImpl calc;

	@Mock
	private BasicOperationsService basicOperationService;
	
	
	@Test
	@DisplayName("Test suma")
	void tesAdd() {
		
		int a = 6;
		int b = 3;
		
		when(basicOperationService.add(a, b)).thenReturn(9.0);
		
		double resultado =  calc.calculateSum(a, b);
		
		Assert.assertEquals(9.0, resultado);
		
	    verify(basicOperationService).add(6, 3);
		
	}
	
	@Test
	@DisplayName("Test resta")
	void testSubtract() {
		
		int a = 6;
		int b = 3;
		
		when(basicOperationService.subtract(a, b)).thenReturn(3.0);
		
		double resultado =  calc.calculateSubstraction(a, b);
		
		Assert.assertEquals(3.0, resultado);
		
	    verify(basicOperationService).subtract(6, 3);

	}
	
	
	@Test
	@DisplayName("Test multiplicacion")
	void testMultiply() {
		
		int a = 6;
		int b = 3;
		
		when(basicOperationService.multiply(a, b)).thenReturn(18.0);
		
		double resultado =  calc.calculateMultiplication(a, b);
		
		Assert.assertEquals(18.0, resultado);
		
	    verify(basicOperationService).multiply(6, 3);

	}
	
	@Test
	@DisplayName("Test division")
	void testDivide() {
		
		int a = 6;
		int b = 3;
		
		when(basicOperationService.divide(a, b)).thenReturn(2.0);
		
		double resultado =  calc.calculateDivision(a, b);
		
		Assert.assertEquals(2.0, resultado);
		
	    verify(basicOperationService).divide(6, 3);

	}
}
