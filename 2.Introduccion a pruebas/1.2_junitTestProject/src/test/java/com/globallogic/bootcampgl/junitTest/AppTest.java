package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {
	
	private static final String nameOne = "Natalia";
	private static final String nameTwo = "Natalia";
	private static final String nameThree = "Daniela";


	@Test
	void test() {

		assertTrue(nameOne.equals(nameTwo) && !nameTwo.equals(nameThree));

	}

}
