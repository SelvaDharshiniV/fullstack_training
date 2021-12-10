package com.training;

public class Application {

	public static void main(String[] args) {
		Student selva = new Student();
		// can't access firstName bcz it is marked as private in the Student class
//		System.out.println(selva.firstName);
		// can access bcz it is taken as default which is same as package 
		System.out.println(selva.fees);

	}

}
