package com.example.demo;

public class MobileBill {
	private String customerName;
	private double mobileNumber ;
	private String planName ;
	private Address address;

	public static final String COMPANY="Airtel";

	public MobileBill() {
		super();
	}

	public MobileBill(String customerName, double mobileNumber, String planName, Address address) {
		super();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.planName = planName;
		this.address = address;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static String getCompany() {
		return COMPANY;
	}
	
	
	
}
