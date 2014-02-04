package de.devboost.natspec.examples.airline.entity;

public class Passenger extends Entity {

	private String lastname;
	private String firstname;
	private int age;

	public Passenger(String firstname, String lastname) {
		super();
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setAge(age);
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

}
