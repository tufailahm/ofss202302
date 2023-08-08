package com.training.demo1.traditionalinterface;

import java.util.List;

import com.training.lambdasolution.RoboCall;
import com.training.model.Person;
import com.training.utility.PersonData;

public class App {
	public static void main(String[] args) {


		//using lambda
		System.out.println("using lambda greater  than 30 ");
		robocallEligible((Person p) -> p.getAge() > 30 );

		System.out.println("female 18 - 21");
		robocallEligible(p -> p.getGender() == "female" &&
                p.getAge()>=18 &&
                p.getAge()<=25);
		
		
		
	}

	public static void robocallEligible(EligiblePerson tester) {
		List<Person> persons = PersonData.gatherPersons();
        for (Person p : persons) {
            if (tester.isEligible(p)) {
                String num=p.getPhone();
                RoboCall.robocall(num);   
 		     } 
        }
	}
}
