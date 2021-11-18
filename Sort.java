package com.bridgelabz.addressbook;

import java.util.Collections;
import java.util.List;

public class Sort {

	// method to sort operation
	public static void sortByName(List<Person> person) {

		Collections.sort(person, Person.firstNameSorting);

		for (Person p : person) {
			System.out.println(p);
		}
	}

}