package com.training.demo1;

import java.util.List;
import java.util.function.Function;

import com.training.model.Person;
import com.training.utility.PersonData;

//function
public class Demo2 {

	public static void main(String[] args) {
		List<Person> pl = PersonData.gatherPersons();
		Function<Person, String> personFunction = t -> t.getGivenName();

		System.out.println("\n== First Person");
		System.out.println(personFunction.apply(pl.get(0)));

	}
}
