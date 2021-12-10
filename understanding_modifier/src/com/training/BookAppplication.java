package com.training;

public class BookAppplication {

	public static void main(String[] args) {
		Book headFirst= new Book();
		
//		headFirst.setBookId(101);
//		headFirst.setAuthorName("Kathy Sieera");
//		headFirst.setPrice(450.00);
		
		System.out.println(headFirst.getBookId());
		System.out.println(headFirst.getAuthorName());
		System.out.println(headFirst.getPrice());
		
		// should supply all the values
		Book effJava =new Book("Effective Java",102, 560.00);
		
		System.out.println(effJava.getBookId());
		System.out.println(effJava.getAuthorName());
		System.out.println(effJava.getPrice());

	}

}
