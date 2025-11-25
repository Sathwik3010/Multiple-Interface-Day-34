package com.codegnan.multipleInterface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String command = sc.nextLine().trim().toLowerCase();
		
		Car car = new Car();
		
		if(command.equals("move")) {
			System.out.println(car.move());
		} else if(command.equals("stop")) {
			System.out.println(car.stop());	
		}
		sc.close();
	}

}
