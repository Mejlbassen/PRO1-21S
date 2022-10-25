package Opgave_1;

import javafx.scene.control.CheckBox;

public class Person {
	private String firstName;
	private String lastName;
	private String email;
	private CheckBox senior;

	public Person(String firstName, String lastName, String email, CheckBox senior) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.senior = senior;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public CheckBox getSenior(){return this.senior;}

	@Override
	public String toString() {
		return firstName + " " + lastName + senior + " (" + email + ")";
	}

}
