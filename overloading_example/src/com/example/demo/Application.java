package com.example.demo;

import com.example.demo.model.*;
import com.example.demo.services.*;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
//		using wrapper class, parsing the string representaion to respective types
		int employeeId= Integer.parseInt(args[0]);
		String employeeName=args[1];
		String designation=args[2];
		double salary=Double.parseDouble(args[3]);
		Employee selva =new Employee(employeeId, employeeName, designation, salary);
		
//		Employee selva =new Employee(101,"Mona","developer",30000);
//		Employee dharshini=new Employee(102, "Aishu", "manager", 60000);
//		Employee rakesh =new Employee(103, "Rakesh", "Manager", 70000);

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id");
			int empId=sc.nextInt();
		System.out.println("Enter Employee Name");
			String empName=sc.next();
		System.out.println("Enter Employee Designation");
			String desig=sc.next();
		System.out.println("Enter Employee Salary");
			double empSal=sc.nextInt();
		Employee rakesh =new Employee(empId, empName, desig, empSal);
		sc.close();
		
//		calling OverLoad Method
		EmployeeService service = new EmployeeService();
		System.out.println("Expected: 15000 => Actual:=" +service.calculateBonus(selva));
		System.out.println("Expected: 18000 => Actual:=" +service.calculateBonus(rakesh.getSalary()));
	
		Double salary2=Double.valueOf(50000);
		int intSalary2=(int)(salary2.doubleValue()); // Casting
		System.out.println("Expected: 16000 => Actual:=" +service.calculateBonus(salary2));
		
		System.out.println("Before:="+ rakesh.getSalary());
		service.updateSalary(rakesh);
		System.out.println("After:="+ rakesh.getSalary());
		
		System.out.println("Expected: 90000 => Actual:=" +rakesh.getSalary());

		Invoice.showAll();
		Invoice.showAll();
	}

}
