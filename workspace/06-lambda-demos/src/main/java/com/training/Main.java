package com.training;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		MathOperation m2 = (a,b) -> a+b;
		System.out.println(m2.operation(12, 23));
	}

}
