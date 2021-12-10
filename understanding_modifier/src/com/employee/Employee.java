package com.employee;

public class Employee {
	private double salary;
	private String busRoute;
	
	public Employee() {
//		super();
		this(19407,"Pallavaram"); 
	}

	public Employee(int salary, String busRoute) {
		super();
		this.salary = salary;
		this.busRoute = busRoute;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getBusRoute() {
		return busRoute;
	}

	public void setBusRoute(String busRoute) {
		this.busRoute = busRoute;
	}
	
}
