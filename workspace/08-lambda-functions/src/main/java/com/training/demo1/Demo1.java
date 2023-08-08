package com.training.demo1;

import java.util.List;
import java.util.function.Consumer;

import com.training.model.Person;
import com.training.utility.PersonData;

//consumer
public class Demo1 {


	public static void main(String[] args) {
		List<Person> pl = PersonData.gatherPersons();
	     Consumer<Person> personConsumer = t -> 
         System.out.println("Surname: " + t.getSurName() 
             + " City: " + t.getCity());
     
     pl.stream().forEach(personConsumer);
     
     System.out.println("== First Buyer - Method");
     personConsumer.accept(new Person(null, null, 0, null, null, null, null, null, null, null));



		
		
		
		
		
		
		
		
	}
}










