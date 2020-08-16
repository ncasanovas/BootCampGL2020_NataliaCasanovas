package com.globallogic.patrones1;

public class App {
	
	public static void main(String[] args) {
		
		
		int power = 0;
		LedAppliance ledAppliance = null;
		
		ElectricalOven electricalOven = new ElectricalOven(power, ledAppliance);
		
		System.out.println(electricalOven.getPower());
		electricalOven.turnOn();
		System.out.println(electricalOven.getPower());
		electricalOven.turnLed();
		System.out.println(electricalOven.getPower());


		
	}
}
