package com.example.demo.service;

public class MyService {

	public int mark () {
//			Object strMark=new String("ninety");
//			Object strMark=new Integer(45);
//			DEPRECATED MEANS IN FUTURE THE SUPPORT WILL BE WITHDRAWN OR IT WILL BE REMOVED
			Object strMark= Integer.valueOf(45);
			int mark=0;
			try {
				mark = (Integer)strMark;
			} catch (ClassCastException e) {
				e.printStackTrace();
			}	
			System.out.println(mark);
		return 0;
	}
	
	public double markWithNestedCatch (String markScored) {
//		Object strMark=new String("ninety");
		Object strMark= Integer.valueOf(45);
		int mark=0;
		double testScore=0.0;
		try {
			try {
				mark = (Integer)strMark;
			} catch (Exception e) {
				e.printStackTrace();
			}
			testScore= Double.parseDouble(markScored);
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println(mark);
		System.out.println(testScore);
	return 0;
    }
	
	public double markWithMultiCatch (String markScored) {
		Object strMark= Integer.valueOf(50);
		int mark=0;
		double testScore=0.0;
		try {
			mark = (Integer)strMark;
			testScore= Double.parseDouble(markScored);
		} catch (ClassCastException| NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println(mark);
		System.out.println(testScore);
	return 0;
    }
//Declare exception instead of handeling it
	public String exampleForDeclare(String name)throws NullPointerException {
		return name.toUpperCase();
	}
}
