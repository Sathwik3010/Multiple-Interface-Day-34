package com.codegnan.multipleInterface;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine().trim();
        String title = sc.nextLine();
        
        LibraryBook book = new LibraryBook();

        if(command.equals("borrow")) {
        	System.out.println(book.borrow(title));
        }        else if (command.equals("return")) {
            System.out.println(book.returnBook(title));
        }

        sc.close();
	}

}
