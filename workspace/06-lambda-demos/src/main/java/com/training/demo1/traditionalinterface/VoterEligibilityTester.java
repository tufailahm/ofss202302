package com.training.demo1.traditionalinterface;

import com.training.model.Person;

public class VoterEligibilityTester implements EligiblePerson {
	@Override
	public boolean isEligible(Person p) {
		return p.getAge() >= 21;
	}
}