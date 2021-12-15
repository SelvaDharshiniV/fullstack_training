package com.example.demo;
import java.io.IOException;
import java.util.logging.*;

import com.example.demo.utils.LoggingUtility;
public class Application {
	
	private static Logger logger;
//
	static {
		String path = Application.class.getClassLoader().getResource("logging.properties").getFile();
		System.setProperty("java.util.logging.config.file", path);
		logger = Logger.getLogger(Application.class.getName());
	}

	// static Logger
	// logger=Logger.getLogger(Application.class.getClass().getName());
	  
	  public static void main(String[] args) {
		  Logger logger=LoggingUtility.getLogger(Application.class);
		  
		  FileHandler handler;
			try {
				handler = new FileHandler("mylogs.log",true);
				logger.addHandler(handler);
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
//		logger.setLevel(Level.WARNING);
		logger.severe("1- severe message");
		logger.warning("2- warning message");
		logger.info("3- java.util.logger configured successfully");
		logger.fine("4- fine message");

	}

}
