package com.hotel;

public class Hotel {
	private String dishName;
	private int dishPrice;
	
	public Hotel() {
//		super();
		this("Biriyani",150);
	}
	
	public Hotel(String dishName, int dishPrice) {
		super();
		this.dishName = dishName;
		this.dishPrice = dishPrice;
	}
	
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public int getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(int dishPrice) {
		this.dishPrice = dishPrice;
	}
	
	

}
