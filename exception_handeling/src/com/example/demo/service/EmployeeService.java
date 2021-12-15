package com.example.demo.service;
import com.example.demo.*;
import com.example.demo.exception.*;
public class EmployeeService {
	private double total;
	public double calculateTotalSalary(Employee[] empList) {

		if (empList.length < 2 || empList.length > 5) {
			try {
				throw new RangeCheckEception("length should be less than 2 or greater than 5");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			for (Employee emp : empList) {
				total = total + emp.getSalary();
			}
		}
		return total;
		}
	}

