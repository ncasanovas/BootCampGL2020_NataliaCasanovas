package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class AppTest {
	

	@Test
	void test() {

		assertTrue(25 > 12);
		assertFalse(25 > 27);

	}

}
