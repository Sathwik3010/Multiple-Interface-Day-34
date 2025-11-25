package com.codegnan.multipleInterface;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        String command = sc.nextLine().trim().toLowerCase();
	        LightController light = new LightController();

	        if (command.equals("dim")) {
	            System.out.println(light.Dim());
	        } else if (command.equals("brighten")) {
	            System.out.println(light.brighten());
	        }

	        sc.close();
	}

}
