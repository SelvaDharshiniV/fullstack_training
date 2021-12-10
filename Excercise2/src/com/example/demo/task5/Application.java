package com.example.demo.task5;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Customer Type (Corporate or Retail)");
			String customerType=sc.next();
		System.out.println("Enter th Id");
			int id = sc.nextInt();
		System.out.println("Enter the bookName");
			String bookName = sc.next();
		System.out.println("Enter the author");
			String author = sc.nextLine();
			sc.nextLine(); 
		System.out.println("Enter the price");
			double price =sc.nextDouble();
			
		sc.close();
		Book book=new Book(id, bookName, author, price);
		BookService obj1=new BookService();
		obj1.discount(book,customerType);
			
	}
}
