package com.training.demo1;

import java.util.List;

import com.training.model.Person;
import com.training.utility.PersonData;
class MakeCall1 {

	public static void roboCall(String number) {

		System.out.println("Calling :" + number);
	}
}
class MakeCall2 {

	public static void roboCall(Person p) {
		System.out.println("Calling :" + p.getPhone());
	}
}
public class Demo1 {

	public Demo1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Person> pl = PersonData.gatherPersons();
		System.out.println("Printing all people :");

		pl.forEach(person -> System.out.println(person));
		
		System.out.println("Printing bangalore people :");
		
		pl.stream()
			.filter(p -> p.getCity().equals("delhi"))
			.forEach(p -> System.out.println(p));
		
		
	System.out.println("Printing bangalore people using method references :");
		
		pl.stream()
			.filter(p -> p.getCity().equals("delhi"))
			.forEach(System.out::println);
		
		
		System.out.println("Print all male having age more than 20");
		
		List<Person> persons = PersonData.gatherPersons();
		persons.stream()
		.filter(p->p.getAge()>20&&p.getGender().equals("male")) 
		.forEach(p->System.out.println(p));  
		
		
		
		//Make a call to all females having age less than 20
		
		System.out.println("Make calls in makecall1 - number");
		persons.stream()
		.filter(p -> p.getAge() < 20)
		.filter(p -> p.getGender().equalsIgnoreCase("female"))
		.forEach(p -> MakeCall1.roboCall(p.getPhone()));
		
		
		//Make a call to all females having age less than 20
		
		System.out.println("Make calls in makecall2 - number");
		persons.stream()
		.filter(p -> p.getAge() < 20)
		.filter(p -> p.getGender().equalsIgnoreCase("female"))
		.forEach(p -> MakeCall2.roboCall(p));
		
		
		//Make a call to all females having age less than 20
		
		System.out.println("Make calls in makecall1 - number - Method refernces");
		persons.stream()
		.filter(p -> p.getAge() < 20)
		.filter(p -> p.getGender().equalsIgnoreCase("female"));
	//	.forEach(MakeCall1::roboCall);  will not work since it is taking primitive
		
		//Make a call to all females having age less than 20
		
		System.out.println("Make calls in makecall2 - object - Method refernces");
		persons.stream()
		.filter(p -> p.getAge() < 20)
		.filter(p -> p.getGender().equalsIgnoreCase("female"))
		.forEach(MakeCall2::roboCall);
		
		
		
		//1st way using a object
		
		
		//2nd way using method references
		
		//print all males		//creating an object
		System.out.println("Printing all males");
		List<Person> allPersons = PersonData.gatherPersons();
		allPersons
		.stream()
		.filter(p -> p.getGender().equalsIgnoreCase("male"))
	    .forEach(p -> System.out.println(p));
		
		System.out.println("Printing all males using method references");
		allPersons
		.stream()
		.filter(p -> p.getGender().equalsIgnoreCase("male"))
	    .forEach(System.out::println);
		
		
		
		
		//Print all persons who are male and name starts with T or t
		
		
		//Make a call to all persons who are male and name starts with T or t
		
		
		
		
		
		
		
		
		
		
	}
}










