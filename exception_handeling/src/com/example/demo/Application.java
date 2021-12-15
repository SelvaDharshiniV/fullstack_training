package com.example.demo;
import com.example.demo.exception.RangeCheckEception;
import com.example.demo.service.*;
public class Application {
	public static void main(String[] args) throws RangeCheckEception {
//		MyService service = new MyService();
//		service.mark();
//		service.markWithNestedCatch("50");
//		service.markWithMultiCatch("60");
//		String city=null;
//		try {
//			service.exampleForDeclare(city);
//		} catch (NullPointerException e) {
////			e.printStackTrace();
//			System.err.println(e.getMessage());
////			err message will be in red color
//		}

		

		EmployeeService service=new EmployeeService();
		Employee emp1 = new Employee(101,"Dharshini","Employee",19407);
		Employee emp2 = new Employee(102,"Kanic","Employee",19407);
		Employee emp6 = new Employee(102,"Kanic","Employee",19407);

//		Employee[] empList= {emp1};
		Employee[] empList= {emp1,emp2,emp6}; 
		System.out.println(service.calculateTotalSalary(empList));


		
		
		
		
//		Object strMark=new String("ninety");
//		int mark=0;
//		try {
//			mark = (Integer)strMark;
//		} catch (ClassCastException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(mark);
	}

}
