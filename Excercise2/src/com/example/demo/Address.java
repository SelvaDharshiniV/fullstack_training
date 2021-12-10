package com.example.demo;

public class Address {

	private int doorNum;
	private String street;
	private String area;
	public Address() {
		super();
	}
	public Address(int doorNum, String street, String area) {
		super();
		this.doorNum = doorNum;
		this.street = street;
		this.area = area;
	}
	public int getDoorNum() {
		return doorNum;
	}
	public void setDoorNum(int doorNum) {
		this.doorNum = doorNum;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
}
