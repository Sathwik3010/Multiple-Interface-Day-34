package com.codegnan.multipleInterface;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        String command = sc.nextLine().trim();
	        String answer = sc.nextLine();

	        ExamPortal portal = new ExamPortal();

	        if (command.equalsIgnoreCase("submit")) {
	            System.out.println(portal.submit(answer));
	        } 
	        else if (command.equalsIgnoreCase("review")) {
	            System.out.println(portal.review(answer));
	        }

	        sc.close();
	}

}
