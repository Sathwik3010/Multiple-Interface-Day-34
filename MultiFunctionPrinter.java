package com.codegnan.multipleInterface;

public class MultiFunctionPrinter implements Printable, Scannable{

	@Override
	public String print (String message) {
		// TODO Auto-generated method stub
		return "Printed: "+message;
	}

	@Override
	public String scan(String message) {
		// TODO Auto-generated method stub
		return "Scanned: "+message;
	}

}
