package com.codegnan.multipleInterface;

public class Document implements Editable, Viewable{

	@Override
	public String view(String text) {
		// TODO Auto-generated method stub
		return "Viewed: "+text;
	}

	@Override
	public String edit(String text) {
		// TODO Auto-generated method stub
		return "Edited: "+text;
	}

}
