package com.codegnan.multipleInterface;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        String command = sc.nextLine().trim();
	        int value = Integer.parseInt(sc.nextLine().trim());

	        SmartTV tv = new SmartTV();

	        if (command.equalsIgnoreCase("channel")) {
	            System.out.print(tv.switchChannel(value));
	        } else if (command.equalsIgnoreCase("volume")) {
	            System.out.print(tv.adjustVolume(value));
	        }

	        sc.close();
	}

}
