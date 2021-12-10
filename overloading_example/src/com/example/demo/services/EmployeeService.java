package com.example.demo.services;

import com.example.demo.model.*;

public class EmployeeService {
//	DRY Principle followed
public double calculateBonus(Employee employee) {
	return calculateBonus(employee.getSalary());
}
// Overload Method
public double calculateBonus(double salary) {
	return salary*.30;
}
//Overload Method with autoboxing
public double calculateBonus(Double salary) {
	return (salary*.30 )+1000;
}
public Employee updateSalary(Employee employee) {
	double updatedSalary = employee.getSalary()+20000;
	employee.setSalary(updatedSalary);
	return employee;
}

}
