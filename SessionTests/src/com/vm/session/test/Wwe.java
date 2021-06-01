package com.vm.session.test;

import java.util.stream.Stream;

public class Wwe {

	String firstName;
	String lastName;
	int weight;
	
	public Wwe(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}

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

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Wwe [firstName=" + firstName + ", lastName=" + lastName + ", weight=" + weight + "]";
	}

	

	

}
