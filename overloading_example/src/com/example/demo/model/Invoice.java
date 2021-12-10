package com.example.demo.model;

import static java.lang.Math.*;
public class Invoice {
	//Declaring a constant - Note the All CAPs
	public static final int STARTNUMBER=100;
	private int invoiceNumber;   //instance variable
	private static double discount ;    // static or class variable
//	instance method can access boyh instance and static variable
	public void show() {
		System.out.println(invoiceNumber);
		System.out.println(discount);
//		STARTNUMBER++;
		showAll();
	}
//	static method can access ONLY static variable and static method
	public static void showAll() {
//		System.out.println(invoiceNumber);  //bcz it is instance variable
		System.out.println(discount);
//		show();                     //bcz it is instance method
		
		System.out.println(Math.sqrt(4));
		double radian30=Math.toRadians(30);
		double radian60=Math.toRadians(60);
		System.out.println(Math.sin(radian30));
		System.out.println(Math.cos(radian60));
	}	
	public static void showAll2() {	
      // remove Math , since static import is used we are not calling the methods with the class name
		System.out.println(sqrt(4));
		double radian30=toRadians(30);
		double radian60=toRadians(60);
		System.out.println(sin(radian30));
		System.out.println(cos(radian60));
	}

}
