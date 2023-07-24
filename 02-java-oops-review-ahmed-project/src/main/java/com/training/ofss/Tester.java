package com.training.ofss;

public class Tester {
	static int m(int i) {
		try {
			i++;
			if (i == 1)
				throw new Exception();
		} catch (Exception e) {
			i += 10;
			return i;
		} finally {
			i += 5;
		}
		i++;
		return i;
	}

	public static void main(String[] args) {
		System.out.println(m(0));
	}
}
