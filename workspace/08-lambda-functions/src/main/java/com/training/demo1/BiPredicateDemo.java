package com.training.demo1;

import java.util.List;
import java.util.function.BiPredicate;

import com.training.model.Person;
import com.training.utility.PersonData;

public class BiPredicateDemo {

	public BiPredicateDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Person> pl = PersonData.gatherPersons();
		BiPredicate<Person, String> biPredicate = (t, s) -> t.getGivenName().equals(s);

		System.out.println("===============   ");
		System.out.println(biPredicate.test(pl.get(0), "Neha"));
	}
}
