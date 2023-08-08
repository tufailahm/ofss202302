package com.training.demo1;

import java.util.List;
import java.util.function.ToDoubleFunction;

import com.training.model.Person;
import com.training.utility.PersonData;

public class ToDoubleFunctionExample {

	public ToDoubleFunctionExample() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		List<Person> persons = PersonData.gatherPersons();
		
		//Represents a function that produces a double-valued result.
		//This is the double-producing primitive specialization for Function. 
	     ToDoubleFunction<Person> discountFunction = 
	             t -> t.getAge() * 2;
	         
	         System.out.println("\n== Double the age ");
	         System.out.println(
	             discountFunction.applyAsDouble(persons.get(2)));
	         
	         System.out.println(
		             discountFunction.applyAsDouble(persons.get(1)));
	         
	         Integer i = persons.get(2).getAge()*2;
	         
	        System.out.println("Doing Directly----"); 
	        System.out.println(i);
	        System.out.println(persons.get(1).getAge()*2);

	        

	}

}
