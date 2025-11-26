package com.codegnan.multipleInterface;

public class LibraryBook implements Borrowable, Returnable{

	@Override
	public String returnBook(String title) {
		// TODO Auto-generated method stub
		return "Returned: "+title;
	}

	@Override
	public String borrow(String title) {
		// TODO Auto-generated method stub
		return "Borrowed: "+title;
	}

}
