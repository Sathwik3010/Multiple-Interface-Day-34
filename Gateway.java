package com.codegnan.multipleInterface;

public class Gateway implements Processable, Refundable{

	@Override
	public String Refund(double amount) {
		// TODO Auto-generated method stub
		return "Refunnded: "+amount;
	}

	@Override
	public String process(double amount) {
		// TODO Auto-generated method stub
		return "Processed: "+amount;
	}

}
