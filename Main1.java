package com.codegnan.multipleInterface;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        String command = sc.nextLine().trim().toLowerCase();
	        String message = sc.nextLine();

	        MultiFunctionPrinter printer = new MultiFunctionPrinter();

	        if (command.equals("print")) {
	            System.out.println(printer.print(message));
	        } else if (command.equals("scan")) {
	            System.out.println(printer.scan(message));
	        }

	        sc.close();	}

}
