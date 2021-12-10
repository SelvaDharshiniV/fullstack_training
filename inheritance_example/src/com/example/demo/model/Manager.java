package com.example.demo.model;

public class Manager extends Employee {
	private String[] skillSet;

	public Manager() {
		super();
	}
	public Manager(int employeeId, String employeeName, String designation, double salary, String[] skillSet) {
		super(employeeId, employeeName, designation, salary);
		this.skillSet = skillSet;
	}
	public String[] getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String[] skillSet) {
		this.skillSet = skillSet;
	}
	
}
