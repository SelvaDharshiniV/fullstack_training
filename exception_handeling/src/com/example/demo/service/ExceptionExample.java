package com.example.demo.service;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			System.out.println(args[0].toLowerCase());
		} catch (Exception e) {
			System.err.println("You have add a command Line Argument- Check the input");
			e.printStackTrace();
		}
	}
}
