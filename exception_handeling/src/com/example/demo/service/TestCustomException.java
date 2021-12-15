package com.example.demo.service;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.example.demo.*;
import com.example.demo.exception.RangeCheckEception;
import com.example.demo.utils.LoggingUtility;

public class TestCustomException {
	private static Logger logger;

//static {
//	String path = TestCustomException.class.getClassLoader().getResource("logging.properties").getFile();
//	System.setProperty("java.util.logging.config.file", path);
//	logger = Logger.getLogger(TestCustomException.class.getName());
//}

	public static void main(String[] args) {
		Logger logger=LoggingUtility.getLogger(TestCustomException.class);
		try {
			FileHandler	handler = new FileHandler("logs.log",true);
			logger.addHandler(handler);
		} catch (SecurityException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Employee ram=new Employee();
//		Employee ram=new Employee(employeeId, employeeName, designation, salary)
		ram.setEmployeeId(12);
		ram.setDesignation("developer");
		ram.setEmployeeName("selva");
		ram.setSalary(19407);
		try {
			Employee shaym = new Employee(102, "shyam", "manager", 60000);
//			System.out.println(shaym);
			logger.info(shaym.toString());
		} catch (RangeCheckEception e) {
//			e.printStackTrace();
			logger.warning(e.getMessage());
		}
//		System.out.println(ram);
		logger.warning(ram.toString());
	}

}
