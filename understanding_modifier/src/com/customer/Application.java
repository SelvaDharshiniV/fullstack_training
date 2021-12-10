package com.customer;

import com.employee.*;
import com.hotel.*;

public class Application {
	public static void main(String[] args) {
		Customer objC = new Customer(); 
		Employee objE = new Employee(); 
		Hotel objH = new Hotel();
		EmployeeService objES = new EmployeeService();
		
		System.out.println("Custome ID - " + objC.getCustomerId());
		System.out.println("Custome Name - " +objC.getCustomerName());
		System.out.println("DishName - " +objH.getDishName());
		System.out.println("DishPrice - " +objH.getDishPrice());
		System.out.println("Employee BusRoute - " +objE.getBusRoute());
		System.out.println("Employee Salary - " +objE.getSalary());
		System.out.println("Employee Bonus - " +objES.calculateBonus(objE));
		
		
	}
}
