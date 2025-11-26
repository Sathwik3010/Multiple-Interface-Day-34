package com.codegnan.multipleInterface;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        
        UniversityPortal portal = new UniversityPortal();
        
        for(int i=0;i<n;i++) {
        	String line = sc.nextLine().trim();
        	String[] parts = line.split(" ",2);
        	
        	String command = parts[0];
        	String course = parts[1];

        	if(command.equalsIgnoreCase("register")) {
        		System.out.println(portal.register(course));
        	} else if (command.equalsIgnoreCase("drop")) {
                System.out.println(portal.drop(course));
            }
        	
        	System.out.println();
        }
        sc.close();
	}

}
