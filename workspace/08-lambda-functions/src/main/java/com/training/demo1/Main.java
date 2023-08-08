package com.training.demo1;

import java.util.Objects;
import java.util.function.Supplier;

import com.training.model.Person;

public class Main {

	public static Person produce(Supplier<Person> supp) {
		return supp.get();
	}

	public static void main(String[] args) {
		Person p1 = produce(() -> new Person());
		Person p2 = produce(() -> new Person());

		System.out.println("Check the same object? " + Objects.equals(p1, p2));

	}
}
