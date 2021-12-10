package com.customer;

public class CustomerApplication {
	public static void main(String[] args) {
	    Customer monday=new Customer();
	    
	    monday.setCustomerName("selva");
	    monday.setCustomerId(12);
	    System.out.println(monday.getCustomerName());
	    System.out.println(monday.getCustomerId());
		
	}
 
}
