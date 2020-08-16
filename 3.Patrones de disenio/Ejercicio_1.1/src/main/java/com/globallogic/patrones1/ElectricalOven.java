package com.globallogic.patrones1;

public class ElectricalOven extends ElectricalAppliance {
	
	private LedAppliance ledAppliance;

	public ElectricalOven(int power, LedAppliance ledAppliance) {
		super(power);
		this.ledAppliance = ledAppliance;
	}

	@Override
	public void turnOn() {
		this.setPower(this.getPower() - 75);
		
		
	}
	
	public void turnLed() {
		this.setPower(this.getPower() - 100);
	}
}
