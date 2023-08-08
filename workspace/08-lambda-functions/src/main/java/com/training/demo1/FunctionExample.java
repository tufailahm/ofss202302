package com.training.demo1;

import java.util.List;
import java.util.function.Function;

import com.training.model.Person;
import com.training.utility.PersonData;

public class FunctionExample {

	public FunctionExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		List<Person> pl = PersonData.gatherPersons();

		Function<Person, String> buyerFunction = t -> t.getGivenName();

		System.out.println("\n== First Buyer");
		System.out.println(buyerFunction.apply(pl.get(2)));

	}

}
