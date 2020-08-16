package com.globallogic.patrones1;

public class ElectricalAppliance {

	private int power;
		
	public ElectricalAppliance(int power) {
		this.power = 500;
	}
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public void turnOn() {
		this.power = this.power - 50;
	}

}
