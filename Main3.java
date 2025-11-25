package com.codegnan.multipleInterface;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        String command = sc.nextLine().trim().toLowerCase();
	        NotificationCenter nc = new NotificationCenter();

	        if (command.equals("send")) {
	            String message = sc.nextLine();
	            System.out.println(nc.send(message));
	        } else if (command.equals("clear")) {
	            System.out.println(nc.clear());
	        }

	        sc.close();
	}

}
