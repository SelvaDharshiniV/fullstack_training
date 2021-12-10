package com.employee;
public class EmployeeService {
	public double calculateBonus (Employee salary){
		double bonus = salary.getSalary()*0.33;
		return bonus ;
	}

}
