package com.example.demo;

public class Customer {
	private int customerId;
	private String customerName;
	private String email;
	private double phoneNumber;

	public Customer() {
		super();
	}
	public Customer(int customerId, String customerName, String email, double phoneNumber)throws InvalidEmail {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;

		if(email.contains("@")&&( email.contains(".com")|| email.contains(".in"))) {
			this.email=email;	
		}else {
			throw new InvalidEmail("email should have @ or .com or .in");
		}
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.contains("@")&&(email.contains(".com")||email.contains(".in"))){

			this.email = email;
		}
		else {
			try {
				throw new InvalidEmail("email should have @ or .com or .in");
			} catch (InvalidEmail e) {
				e.printStackTrace();
			}
		}
	}
	public double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + "]";
	}


}
