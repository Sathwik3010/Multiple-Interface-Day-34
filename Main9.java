package com.codegnan.multipleInterface;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String command = sc.next().toLowerCase().trim();
		SmartHome sh = new SmartHome();
		
		if(command.equals("on")) {
			System.out.println(sh.turnOn());
		}else if(command.equals("off")) {
			System.out.println(sh.turnOff());
		}else if(command.equals("temp")) {
			float t = sc.nextFloat();
			System.out.println(sh.setTemperature(t));
		}
		sc.close();
	}

}
