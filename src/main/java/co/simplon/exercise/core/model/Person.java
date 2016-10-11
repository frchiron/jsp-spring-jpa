package co.simplon.exercise.core.model;

import java.util.Objects;

public class Person {
	private String name;
	private String surname;

	public Person() {
		// TODO empty
	}

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Person)) {
			return false;
		}

		Person that = (Person) obj;
		return Objects.equals(this.surname, that.surname) && Objects.equals(this.name, that.name);
	}

}
