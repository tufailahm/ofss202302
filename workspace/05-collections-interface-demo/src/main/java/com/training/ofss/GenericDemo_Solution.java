package com.training.ofss;

//solution with generic
public class GenericDemo_Solution {

	public GenericDemo_Solution() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		Integer[] intArray = { 50, 10, 20, 100, 50 };
		Character[] charArray = { 'J', 'A', 'V', 'A' };
		Boolean[] booleanArray = { true, false, true, false };
		displayArray(intArray);
		displayArray(charArray);
		displayArray(booleanArray);
	}

	public static <T> void displayArray(T[] inputArray) {
		System.out.println("Calling this with :");
		for (T element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

}
