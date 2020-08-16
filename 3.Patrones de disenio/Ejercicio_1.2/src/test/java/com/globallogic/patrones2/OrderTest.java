package com.globallogic.patrones2;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class OrderTest {
	

	private static Order instance1 = new Order("Pesos", 30, Currency.getInstance());
	private static Order instance2 = new Order("Pesos", 30, Currency.getInstance());
	

	@Test
	void testOrder() {
		
		assertSame(instance1.getCurrency(), instance2.getCurrency());
	}
	
	
}
