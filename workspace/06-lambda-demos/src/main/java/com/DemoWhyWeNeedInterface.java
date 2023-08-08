package com;
interface Account
{
	void getDetails();
}
class SavingsAccount implements Account
{

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		
	}
	
}
public class DemoWhyWeNeedInterface {

	public static void main(String[] args) {
		Account a = new SavingsAccount();
		a.getDetails();
	}

}
