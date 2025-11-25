package com.codegnan.multipleInterface;

public class LightController implements Dimable, Brightenable{

	@Override
	public String brighten() {
		// TODO Auto-generated method stub
		return "Brightened";
	}

	@Override
	public String Dim() {
		// TODO Auto-generated method stub
		return "Dimmed";
	}

}
