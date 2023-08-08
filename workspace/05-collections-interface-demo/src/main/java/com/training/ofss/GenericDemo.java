package com.training.ofss;
//without generic
public class GenericDemo {
	public static void main(String args[]) {
		Integer[] intArray = { 50, 10, 20, 100, 50 };
		Character[] charArray = { 'J', 'A', 'V', 'A' };
		Boolean[] booleanArray = {true,false,true,false};
		displayArray(intArray);
		displayArray(charArray);
	}
	
	public static void displayArray(Integer[] inputArray) {
		for (Integer element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void displayArray(Character[] inputArray) {
		for (Character element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

}
