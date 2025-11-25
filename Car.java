package com.codegnan.multipleInterface;

public class Car implements Movable, Stoppable{

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "Stopped";
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
        return "Moving";
	}

}
