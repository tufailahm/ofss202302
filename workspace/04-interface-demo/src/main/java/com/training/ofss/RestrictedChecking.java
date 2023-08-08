package com.training.ofss;
public class RestrictedChecking implements Accessible{
		

 		public double verifyWithdraw(double amount, int pin){
			return pin;
				//Verify the PIN
				//Verify amount is greater than 0
				//Verify account balance won't go negative
				//Verify the withdrawal is under the transaction limit.
		}

		@Override
		public double verifyDeposit(double amount, int pin) {
			// TODO Auto-generated method stub
			return 0;
		}
}
