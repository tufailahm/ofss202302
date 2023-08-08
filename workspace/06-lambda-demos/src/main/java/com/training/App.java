package com.training;

import java.util.List;

import com.training.demo1.traditional.DriverEligibilityTester;
import com.training.demo1.traditional.EligiblePerson;
import com.training.lambdasolution.RoboCall;
import com.training.model.Person;
import com.training.utility.PersonData;

public class App {
	static List<Person> pl = PersonData.gatherPersons();
	public static void main(String[] args) {

		EligiblePerson eTester = new DriverEligibilityTester();
		robocallEligible(eTester);
	}

	public static void robocallEligible(EligiblePerson tester) {
		for (Person p : pl) {
			if (tester.isEligible(p)) {
				String num = p.getPhone();
				RoboCall.robocall(num);
			}
		}
	}
}
