package com.example.demo;

public class InvalidEmail extends Exception {
	private String message;

	 public InvalidEmail(String message) {
//		 super();
		 this.message=message;
		 
	 }
	@Override
	public String getMessage() {
		return this.message;
	}
	
}
