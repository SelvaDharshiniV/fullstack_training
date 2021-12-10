package com.example.demo;
import com.example.demo.*;
public class Application {

	public static double findAmount (MobileBill bill) {
		String planName = bill.getPlanName();
		
		switch (planName) {
		case "prepaid":
			return 200 ;
		case "postpaid":
			return 300;
		default:
			return 0;
		}
	}
	public static void main(String[] args) {
		Address address=new Address(19, "New street", "Anakaputhur");
		MobileBill bill= new MobileBill("selva", 73391772, "prepaid", address);
		MobileBill bill2= new MobileBill("selva", 73391772, "postpaid", address);
	    double total=findAmount(bill);
	    double total2=findAmount(bill2);
	    System.out.println("Expected:200 => Actual:"+total);
	    System.out.println("Expected:300 => Actual:"+total2);
	}

}
