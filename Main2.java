package com.codegnan.multipleInterface;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String command = sc.nextLine().trim().toLowerCase();
        String text = sc.nextLine();

        Document doc = new Document();
        
        if(command.equals("edit")) {
        	System.out.println(doc.edit(text));
        } else if(command.equals("view")) {
        	System.out.println(doc.view(text));
        }
		sc.close();
	}

}
