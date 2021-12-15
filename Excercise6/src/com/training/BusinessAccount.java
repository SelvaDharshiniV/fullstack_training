package com.training;

public class BusinessAccount extends BankAccount {
	private double balance=10000;
	private double minBalance=25000;
	private double maxDeposit=100000;

	@Override
	public double deposit(double amount) {
		if (amount < maxDeposit) {
			System.out.println(amount+" is deposited");
		}
		else {
			System.out.println("Maximun Deposit amount is 100000");
		}
		return 0;
	}

	@Override
	public double withdraw(double amount) {
		if ((balance-amount) >= minBalance) {
			System.out.println(amount +"is withdraw");
		}
		else {
			System.out.println("Minimum Balance should greater than 25000");
		}
		return 0;
	}

}
