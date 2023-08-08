package com.training.ofss;
interface Calculator
{
	int addition(int num1,int num2);
}

public class AnoDemo {
	public static void main(String[] args) {
		Calculator c = new Calculator()
				{
					@Override
					public int addition(int num1, int num2) {
						return num1+num2;
					}
				};
				System.out.println(c.addition(12, 90));
	}
}

//option 1 
class Homework implements Calculator{

	@Override
	public int addition(int num1, int num2) {
		
		return num1+num2;
	}
}
