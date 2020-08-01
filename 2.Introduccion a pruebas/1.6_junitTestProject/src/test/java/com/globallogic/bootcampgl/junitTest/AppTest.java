package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
	
	
	private static int suma(int valueOne, int valueTwo) {
		
		return valueOne + valueTwo;
		
	}

	@Test
	@DisplayName(value = "Test suma")
	void test() {
		
		assertTrue(suma(2, 1) == 3);
		
		assertTrue(suma(2, 1) == 5, "El resultado esta mal :");
		

	}

}
