package com.training.lambdasolution;

import java.util.List;
import java.util.function.Predicate;

import com.training.model.Person;
import com.training.utility.PersonData;

public class LambdaDemo_Predicate {



	static List<Person> pl = null;

	public static void main(String[] args) {
		pl = PersonData.gatherPersons();
		System.out.println("<=20");
		robocallEligibile((Person p) -> p.getAge() <= 20);
		System.out.println(">=16");
		robocallEligibile((Person p) -> p.getAge() >= 16); // Drivers
		System.out.println(">=18");
		robocallEligibile((Person p) -> p.getAge() >= 18); // Voters
		System.out.println("delhi");
		robocallEligibile((Person p) -> p.getCity().equalsIgnoreCase( "delhi")); // Residents
		System.out.println("p.getAge() >= 18 && p.getAge() <= 25");
		robocallEligibile((Person p) -> p.getAge() >= 18 && p.getAge() <= 25);

	}

	public static void robocallEligibile(EligiblePerson tester) {
		for (Person p : pl) {
			if (tester.isEligible(p)) {
				RoboCall.robocall(p.getPhone());
			}
		}
	}

	public static void robocallEligibile(Predicate pred) {
		for (Person p : pl) {
			if (pred.test(p)) {
				RoboCall.robocall(p.getPhone());
			}
		}
	}

}
