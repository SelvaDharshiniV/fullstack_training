package com.training;
import com.trainaing.model.*;
import com.training.ifaces.*;
public class Application {
	public static void printResult(Conditional condition) {
		System.out.println(condition.test());
	}
	public static void printValue(Function[] objects) {
		for (Function eachFunction:objects) {
			System.out.println(eachFunction.apply(50));
			
		}
	}
	public static void main(String[] args) {
		Function usdToInr=new CurrencyConverter();
		Function celToFar=new TempConverter();
		Function[] functions = {usdToInr,celToFar};
		printValue(functions);
		
		Student ram = new Student(100, 80);
		printResult(ram);
		Professor kanna= new Professor(202,"mca");
		printResult(kanna);
	}

}
