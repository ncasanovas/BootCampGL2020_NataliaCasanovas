package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
	
	private static Long ID = null;

	@Test
	@DisplayName(value = "Test null")
	void test() {

		assertNull(ID);
		
		ID = (long) 1;
		
		assertNotNull(ID);

		

	}

}
