package com.example.demo.task5;
// cahange the return type from void to double
public class BookService {
	public double discount  (Book book){
		double price=book.getPrice();
		if (price <= 500) {
			System.out.println(price*.05);
		}
		else if( price >500 && price <= 1000) {
			System.out.println(price*.1);
		}
		else if (price>1000) {
			System.out.println(price*.12);	
		}
		return 0;
	}
	public double discount(Book book ,String customeType){
		double price=book.getPrice();
//		private String book;
	switch (customeType) {
	case "Corporate":
		if (price <= 500) {
			System.out.println(price-price*.07);
		}
		else if( price >500 && price <=1000) {
			System.out.println(price-price*.12);
		}
		else if (price>1000) {
			System.out.println(price-price*.15);
		}
		break;
	case "Retail":
		if (price <= 500) {
			System.out.println(price-price*.05);
		}
		else if( price >500 && price <=1000) {
			System.out.println(price-price*.1);
		}
		else if (price>1000) {
			System.out.println(price-price*.12);	
		}
		break;
	default:
		break;
	}
	return 0;
	}
}
