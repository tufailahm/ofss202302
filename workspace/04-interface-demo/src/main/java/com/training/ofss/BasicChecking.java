package com.training.ofss;
class Account {
	public  double verifyDeposit(double amount, int pin) {
		System.out.println("Verify deposit of Account class");
		return pin;
		// Verify the PIN
		// Verify amount is greater than 0
	}
}
public class BasicChecking extends Account implements Accessible{

		
	public static void main(String[] args) {
		BasicChecking c = new BasicChecking();
		c.verifyDeposit(OVERDRAFT_FEE, 999);
	}
}
