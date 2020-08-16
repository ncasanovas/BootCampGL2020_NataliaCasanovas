package com.globallogic.patrones2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class ProductTest {
	

	private static Product instance1 = Product.getInstance();


	@Test
	void testProductName() {
		
		assertEquals(instance1.getName(), "Clavos");
	}
	
	@Test
	void testProductInstance() {
		Product instance2 = Product.getInstance();
		assertSame(instance1, instance2);
	}
	
}
