package com.training.ofss;

public interface Accessible {
	public static final double OVERDRAFT_FEE = 25;

	public default double verifyDeposit(double amount, int pin) {
		System.out.println("Verify deposit of Accessible interface");
		return pin;
		// Verify the PIN
		// Verify amount is greater than 0
	}

	public default double verifyWithdraw(double amount, int pin) {
		return pin;
		// Verify the PIN
		// Verify amount is greater than 0
		// Verify account balance won't go negative
	}
}
