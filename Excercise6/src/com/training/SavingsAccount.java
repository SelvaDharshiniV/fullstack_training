package com.training;

public class SavingsAccount extends BankAccount {
	private double balance=5000;
	private double minBalance=5000;
	private double maxDeposit=10000;

//	public SavingsAccount(double balance) {
//		super(balance);
//	}

	@Override
	public double deposit(double amount) {
		if (amount <= maxDeposit) {
			System.out.println(amount+" is deposited");
//			setBalance(getBalance()+amount);
		}
		else {
			System.out.println("Maximun Deposit amount is 10000");
		}
		return 0;
	}

	@Override
	public double withdraw(double amount) {
		   
		if ((balance-amount) >= minBalance) {
			System.out.println(amount +"is withdraw");
		}
		else {
			System.out.println("Minimum Balance should greater than 5000");
		}
		return 0;
	}
}
