package com.bridgelabz.addressbook;

import java.util.Comparator;

public class Person {

	//variables
	private String firstName, lastName, address, city, state, zip, pNumber, email;

	//Constructor
	public Person(String firstName, String lastName, String address, String city, String state, String zip,
			String pNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.pNumber = pNumber;
		this.email = email;
	}

	public Person() {
		
	}

	//Getter setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//sort by first name
	public static Comparator<Person> firstNameSorting = new Comparator<Person>() {
		
		@Override
		public int compare(Person p1, Person p2) {
			
			String name1 = p1.getFirstName();
			String name2 = p2.getFirstName();
			
			return name1.compareTo(name2);
		}
	};
	
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", "
				+ "lastName=" + lastName + ", "
				+ "address=" + address + ", "
				+ "city=" + city+ ", "
				+ "state=" + state + ", "
				+ "zip=" + zip + ", "
				+ "pNumber=" + pNumber + ", "
				+ "email=" + email + "]";
	}
	
	
	
}