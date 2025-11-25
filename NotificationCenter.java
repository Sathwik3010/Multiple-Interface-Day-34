package com.codegnan.multipleInterface;

public class NotificationCenter implements Notifiable, Clearable{

	@Override
	public String clear() {
		// TODO Auto-generated method stub
		return "Cleared";
	}

	@Override
	public String send(String msg) {
		// TODO Auto-generated method stub
		return "Sent: "+msg;
	}

}
