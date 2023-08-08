package com.training.lambdasolution;

import java.util.List;
import java.util.function.Predicate;

import com.training.model.Person;
import com.training.utility.PersonData;

public class LambdaDemo {

	static List<Person> pl = null;

	public static void main(String[] args) {
	             
		pl = PersonData.gatherPersons();
		robocallEligibile((Person p) -> p.getAge() <= 20);
		robocallEligibile((Person p) -> p.getAge() <= 20);
		robocallEligibile((Person p) -> p.getAge() <= 20);
	}

	public static void robocallEligibile(Predicate<Person> tester) {
		for (Person p : pl) {
			if (tester.test(p)) {
				RoboCall.robocall(p.getPhone());
			}
		}
	}
}
