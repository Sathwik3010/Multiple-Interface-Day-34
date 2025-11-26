package com.codegnan.multipleInterface;

public class UniversityPortal implements Registrable, Droppable{

	@Override
	public String drop(String course) {
		// TODO Auto-generated method stub
		return "Dropped: "+course;
	}

	@Override
	public String register(String course) {
		// TODO Auto-generated method stub
		return "Registered: "+course;
	}

}
