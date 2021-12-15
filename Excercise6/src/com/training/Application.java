package com.training;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		BankAccount business=new BusinessAccount();
		BankAccount saving=new SavingsAccount();
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<10;i++) {
		System.out.println("Enter deposit or withdraw");
		String type=sc.next();
		System.out.println("Enter BusinessAccount or SavingsAccount");
		String acc=sc.next();
		System.out.println("Enter the amount");
		double amo=sc.nextDouble();
//		sc.close();
		switch(type) {
		case "deposit":
			if (acc == "BusinessAccount"){
				System.out.println(business.deposit(amo)); 
			}
			else {
				System.out.println(saving.deposit(amo));	
			}
		case "withdraw":
			if (acc == "SavingsAccount"){
				System.out.println(saving.withdraw(amo));
			}
			else {
				System.out.println(business.withdraw(amo));	
			}
		}
		}
//		business.deposit(amo);
//		saving.deposit(amo);
//		business.withdraw(amo);
//		saving.withdraw(amo);
		
	}

}
