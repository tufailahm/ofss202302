package com.training.ofss;

import java.util.Scanner;

import com.training.ofss.exception.InvalidAgeException;

public class CheckAge {
	int age;
	Scanner scanner = new Scanner(System.in);
	public CheckAge() {
		
	}
	public void takeInput() throws InvalidAgeException {
		System.out.println("Please enter your age to check your eligibility to vote : ");
		age = scanner.nextInt();
		if (age<18 || age > 100)
				throw new InvalidAgeException("You cannot vote now bcoz of age");
		else
			System.out.println("You are eligible for vote");
		
	}
	public static void main(String[] args) {
		CheckAge age = new CheckAge();
		try {
			age.takeInput();
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Thanks for using my program");
	}

}
