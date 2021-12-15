package com.example.demo.exception;

public class RangeCheckEception extends Exception {
	private String message;

	public RangeCheckEception(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
	

}
