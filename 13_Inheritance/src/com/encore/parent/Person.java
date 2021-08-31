package com.encore.parent;

public class Person {
	private String name, address;
	private int age;

	public Person(String name, String address, int age) {
		super(); // Object¸¦ È£Ãâ.
		this.name = name;
		this.address = address;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ", " + age + ", " + address;
	}

}
