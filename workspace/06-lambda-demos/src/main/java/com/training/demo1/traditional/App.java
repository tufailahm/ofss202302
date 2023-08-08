package com.training.demo1.traditional;

import java.util.List;

import com.training.lambdasolution.RoboCall;
import com.training.model.Person;
import com.training.utility.PersonData;

public class App {
	public static void main(String[] args) {

		DriverEligibilityTester eTester = new DriverEligibilityTester();
		robocallEligible(eTester);
	}

	public static void robocallEligible(DriverEligibilityTester tester) {
		List<Person> persons = PersonData.gatherPersons();
        for (Person p : persons) {
            if (tester.isEligible(p)) {
                String num=p.getPhone();
                RoboCall.robocall(num);   
 		     } 
        }
	}
}
