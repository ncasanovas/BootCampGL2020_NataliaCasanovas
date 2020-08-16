package com.globallogic.patrones2;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class CurrencyTest {

	static Currency currency;

	@Test
	void testCurrency() {

		Currency instance1 = Currency.getInstance();
		Currency instance2 = Currency.getInstance();

		assertSame(instance1, instance2);
	}
}
