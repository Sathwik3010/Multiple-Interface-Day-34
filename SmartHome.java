package com.codegnan.multipleInterface;

public class SmartHome implements LightControl, TemperatureControl{

	@Override
	public String setTemperature(float t) {
		// TODO Auto-generated method stub
		return "Temp set to "+t;
	}

	@Override
	public String turnOn() {
		// TODO Auto-generated method stub
		return "Lights on";
	}

	@Override
	public String turnOff() {
		// TODO Auto-generated method stub
		return "Lights off";
	}

}
