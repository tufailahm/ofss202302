package com.training.utility;

import java.util.ArrayList;
import java.util.List;

import com.training.model.Person;

public class PersonData {

	public static List<Person> gatherPersons() {
		Person p1 = new Person("Tufail", "Ahmed", 31, "male", "t@gmail.com", "8867205331", "btm", "bangalore",
				"karnatka", "560029");
		Person p2 = new Person("Neha", "Agrawal", 12, "female", "n@gmail.com", "8867205332", "palace", "delhi", "delhi",
				"160029");
		Person p3 = new Person("Karthik", "Agrawal", 20, "male", "n@gmail.com", "8867205333", "palace", "1delhi",
				"delhi", "160029");
		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		return persons;
	}

}
