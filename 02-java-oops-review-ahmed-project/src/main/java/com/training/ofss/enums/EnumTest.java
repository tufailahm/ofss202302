package com.training.ofss.enums;

public class EnumTest {
	public static void main(String args[]) {

		for (DEPARTMENTS dept : DEPARTMENTS.values()) {
			System.out.println(dept + " Department Code: " + dept.getDeptCode());
		}
	}
}
