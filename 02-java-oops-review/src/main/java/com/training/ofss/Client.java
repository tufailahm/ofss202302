package com.training.ofss;

import com.training.ofss.model.Employee;

public class Client {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		System.out.println(e1);
		
		Employee e2 = new Employee(1001, "Jay","9887", 98000);
		Employee e3 = new Employee(100, "Jay","9887", 98000);
		Employee e4 = e2;
		
		System.out.println(e2==e3);  //false
		System.out.println(e2.equals(e3));	//true -- bcoz we overri equals
		
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());

		
	
	}

}
