package com.codegnan.multipleInterface;

public class Vehicle implements EngineControl, SpeedControl{

	@Override
	public String setSpeed(int speed) {
		// TODO Auto-generated method stub
		return "Speed: "+speed;
	}

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return "Engine Started";
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "Engine Stopped";
	}

}
