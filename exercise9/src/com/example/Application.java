package com.example;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import com.example.demo.Customer;
import com.example.demo.InvalidEmail;
import com.example.demo.utils.LoggingUtility;

public class Application {
	private static Logger logger;

	public static void main(String[] args) {
		Logger logger=LoggingUtility.getLogger(Application.class);
		try {
			FileHandler	handler = new FileHandler("logs.log",true);
			logger.addHandler(handler);
			Customer selva = new Customer(1765,"Selva","selva@gmail.com",7339177);
			logger.info(selva.toString());
			Customer kanic = new Customer();
			kanic.setEmail("kanicraj007@gmail.com");
			logger.info(kanic.toString());
		}catch (SecurityException e1) {
			e1.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		catch(InvalidEmail e) {
			e.printStackTrace();
		}
	}
}
