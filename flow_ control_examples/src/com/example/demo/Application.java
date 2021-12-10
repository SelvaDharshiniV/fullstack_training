package com.example.demo;
import com.example.demo.model.*;
public class Application {

	public static void main(String[] args) {
//compares the location(heap memory)
		Employee ram =new Employee(103, "Rakesh", "Manager", 60000);
		Employee shyam =new Employee(103, "Rakesh", "Manager", 60000);
		boolean isEqual = ram.equals(shyam);
		System.out.println("Expected: True => Actual:=" +isEqual);
		
		Employee oneMoreRam=ram;
		boolean isSame = ram.equals(oneMoreRam);
		System.out.println("Expected: True => Actual:=" +isSame);
		
		
	}

}
