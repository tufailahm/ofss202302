package com.training;

import java.util.List;

import com.training.model.Person;
import com.training.utility.PersonData;

public class MainStream {

	public MainStream() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		List<Person> allPersons = PersonData.gatherPersons();
		allPersons
			.stream()
			.filter(k -> k.getAge() > 16)
			.forEach(k -> System.out.println(k));
		
		
		allPersons
		.stream()
		.filter(k -> k.getAge() > 16)
		.forEach(System.out::println);
	}

}
