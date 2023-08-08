package com.training.demo2.anonymous;

//using anonymous inner classes
import java.util.List;

import com.training.lambdasolution.RoboCall;
import com.training.model.Person;
import com.training.utility.PersonData;

public class App {
	public static void main(String[] args) {

		//EligiblePerson eTester = new DriverEligibilityTester();
		robocallEligible(new EligiblePerson() {
			
			@Override
			public boolean isEligible(Person p) {
				// TODO Auto-generated method stub
				return p.getAge() >= 25;
			}
		});
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
