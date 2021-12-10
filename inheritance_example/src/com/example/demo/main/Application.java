package com.example.demo.main;
import com.example.demo.model.*;
import com.example.demo.services.EmployeeService;
public class Application {

	public static void main(String[] args) {
		Employee ram=new Employee(101,"Ramesh","Employee",60000);
		String[] skills= {"Java","dot.Net","Testing"};
		Manager mgr=new Manager(102, "Suresh", "Manager", 75000, skills);
		System.out.println(ram);
		System.out.println(mgr.getEmployeeId());
		System.out.println(mgr.getEmployeeName());
		System.out.println(mgr.getSalary());
		for(String eachSkill:mgr.getSkillSet())
		System.out.println(eachSkill);

		EmployeeService service=new EmployeeService();
		Manager emp1 = new Manager(101,"Dharshini","Employee",19407, skills);
		Manager emp2 = new Manager(102,"Kanic","Employee",19407, skills);
//		Employee[]  empList = new Employee[2];
//		empList[0]=emp1;
//		empList[1]=emp2;
		Employee[] empList= {emp1,emp2};
		service.printEmployee(empList);


		

	}

}
