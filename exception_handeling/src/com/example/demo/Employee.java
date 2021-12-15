package com.example.demo;
import com.example.demo.exception.*;
public class Employee {
		private int employeeId;
		private String employeeName;
		private String designation;
		private double salary;
		public Employee() {
			super();
		}
		public Employee(int employeeId, String employeeName, String designation,
				double salary)throws RangeCheckEception {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.designation = designation;
			if (salary<=0) {
				throw new RangeCheckEception("salary should be positive");
			}else {
				this.salary = salary;
			}
		}
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			if (salary <=0) {
				try {
					throw new RangeCheckEception("salary should be positive");
				} catch (RangeCheckEception e) {
					e.printStackTrace();
				}
			}else {
				this.salary = salary;
			}
//			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", designation="
					+ designation + ", salary=" + salary + "]";
		}
		
		
}
