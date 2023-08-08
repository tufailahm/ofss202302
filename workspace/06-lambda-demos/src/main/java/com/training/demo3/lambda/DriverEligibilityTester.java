package com.training.demo3.lambda;

import com.training.model.Person;

public class DriverEligibilityTester implements EligiblePerson {
	@Override
	public boolean isEligible(Person p) {
		return p.getAge() >= 16;
	}
}