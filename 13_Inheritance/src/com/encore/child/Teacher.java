package com.encore.child;

import com.encore.parent.Person;

public class Teacher extends Person {

	private String subject;

	public Teacher(String name, String address, int age, String subject) {
		super(name, address, age);
		this.subject = subject;
	}

	@Override
	public String toString() {
		return super.toString() + ", Teacher [subject=" + subject + "]";
	}

}
