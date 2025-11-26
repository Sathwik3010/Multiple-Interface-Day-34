package com.codegnan.multipleInterface;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String command = sc.nextLine().trim();
		double amount = sc.nextDouble();
		
		Gateway pay = new Gateway();
		
		if(command.equalsIgnoreCase("process")) {
			System.out.println(pay.process(amount));
		} else if(command.equalsIgnoreCase("refund")) {
			System.out.println(pay.Refund(amount));
		}
		sc.close();
	}

}
