package com.training.demo1;

import java.util.List;

import com.training.model.Person;
import com.training.utility.PersonData;

public class RoboCallTest07 {

	public static void main(String[] args) {

		List<Person> pl = PersonData.gatherPersons();

		System.out.println("\n=== Calling all Drivers Lambda ===");
		pl.stream().filter(p -> p.getAge() >= 23 && p.getAge() <= 65).forEach(p -> MakeCall2.roboCall(p));

	}
	

}
