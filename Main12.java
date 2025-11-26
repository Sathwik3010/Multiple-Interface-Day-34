package com.codegnan.multipleInterface;

import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vehicle vehicle = new Vehicle();

		int n = Integer.parseInt(sc.nextLine().trim());

		for (int i = 0; i < n; i++) {
			String line = sc.nextLine().trim();

			String[] parts = line.split(" ", 2);

			if (parts[0].equals("start"))
				System.out.println(vehicle.start());
			else if (parts[0].equals("stop"))
				System.out.println(vehicle.stop());
			else if (parts[0].equals("speed")) {
				int speed = Integer.parseInt(parts[1]);
				System.out.println(vehicle.setSpeed(speed));
			}
		}
		sc.close();

	}
}
