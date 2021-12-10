package com.training;

public class Book {
	private String authorName;
	private int bookId;
	private double price;
	
	public Book() {
//		Either super or this 
//		but never both bcz super/this should be the first line
//		super();  //for all java class OBJECT is the super class
		this("dharshini",102,450.00);
	}
	
	public Book(String authorName, int bookId, double price) {
		super();
		// this.authorName refers to the the field private String authorName
		// authorName refers to the method argument authorName
		this.authorName = authorName;
		this.bookId = bookId;
		this.price = price;
	}
	
	public String getAuthorName() {
//		setAuthorName("set");
		return authorName;
	}
	public void setAuthorName(String authorName) {
//		System.out.println(getAuthorName());
		this.authorName = authorName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
