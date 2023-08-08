package com.training.ofss;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		String salary = "9000";
		//use case : increase 500 in salary
		int i = Integer.parseInt(salary);
		System.out.println(i+500);
		
		int num1=10;
		Integer num2 = num1;		//auto boxing
		int num3 = num2;		
	}

}
