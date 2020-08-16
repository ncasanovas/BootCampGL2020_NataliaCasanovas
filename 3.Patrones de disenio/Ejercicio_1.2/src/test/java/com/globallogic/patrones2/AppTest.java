package com.globallogic.patrones2;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AppTest {

	static Currency currency;
	
	@Test
	void testSingleton() {
		Currency instance1 = currency.getInstance();
		Currency instance2 = currency.getInstance();

		assertSame(instance1, instance2);
	}
}
