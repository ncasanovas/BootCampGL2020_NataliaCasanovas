package com.globallogic.patrones1;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;

public class AppTest {

	private ElectricalOven electricalOven;
	private LedAppliance ledAppliance;
	int power = 500;

	
	@BeforeEach
	void Setup(){
		ledAppliance = new LedAppliance();
		electricalOven = new ElectricalOven(power,ledAppliance);

	}
	
	@Test
	void electricalOvenGetPower() {
		assertEquals(electricalOven.getPower(), power);
	}
	
	@Test
	void electricalOvenTurnOn() {
		electricalOven.turnOn();
		assertEquals(electricalOven.getPower(), 425);
	}
	
	@Test
	void electricalOvenTurnLedTurnOn() {
		electricalOven.turnOn();
		electricalOven.turnLed();
		assertEquals(electricalOven.getPower(), 325);
	}
}
