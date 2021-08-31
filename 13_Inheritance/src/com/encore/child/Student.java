package com.encore.child;

import com.encore.parent.Person;

public class Student extends Person {

	private int stdId;

	public Student(String name, String address, int age, int stdId) {
		super(name, address, age);
		this.stdId = stdId;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + "Student [stdId=" + stdId + "]";
	}

}
