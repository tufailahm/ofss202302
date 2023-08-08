package com.training.ofss;

import java.util.Scanner;

import com.training.ofss.exception.InvalidAgeException;

public class CheckAge_Assertion {
	int age;
	Scanner scanner = new Scanner(System.in);
	public CheckAge_Assertion() {
		
	}
	public void takeInput() throws InvalidAgeException {
		System.out.println("Please enter your age to check your eligibility to vote : ");
		age = scanner.nextInt();
		//Scenario 1
		if( age >= 18 && age < 150)
			System.out.println("You are eligible for vote");
		
		//Scenario 2
		if( age >= 18 && age < 150)
			throw new InvalidAgeException("You are eligible for vote");
		
		//Scenario 3
		assert  age >= 18 && age < 150;
			System.out.println("You are eligible for vote");
		
	}
	public static void main(String[] args) {
		CheckAge_Assertion age = new CheckAge_Assertion();
		try {
			age.takeInput();
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Thanks for using my program");
	}

}
