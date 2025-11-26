package com.codegnan.multipleInterface;

public class ExamPortal implements Submittable, Reviewable{

	@Override
	public String review(String ans) {
		// TODO Auto-generated method stub
		return "Reviewing: "+ans;
	}

	@Override
	public String submit(String ans) {
		// TODO Auto-generated method stub
		return "Submitted: "+ans;
	}

}
