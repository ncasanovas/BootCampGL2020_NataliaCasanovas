package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

	private static boolean metodo3(int numero) {

		for (int i = 0; i < numero; i++) {
			if (i == 3) {
				return true;

			} else {
				return false;
			}
		}

		return false;

	}

	@Test
	@DisplayName(value = "Test suma")
	void test() {

		assertTrue(suma(2, 1) == 3);

		assertTrue(suma(2, 1) == 5, "El resultado esta mal :");

	}

}
