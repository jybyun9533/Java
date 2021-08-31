package com.encore.parent;

import com.encore.util.MyDate;

/*
 * �ڽĵ��� �������� ������
 * �Ϲ����� ������ ������ �ִ� �θ� Ŭ����
 */

public class Employee {
	// ����� ����
	public static final double BASIC_SALARY = 100.0;

	private String name;
	private MyDate birthday;
	private double salary;

	public Employee() {
	}; // �⺻������
	
	public Employee(String name, MyDate birthday) {
		this(name, birthday, BASIC_SALARY);
	}

	public Employee(String name, MyDate birthday, double salary) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
	}

	public String getDetails() {
		return name + ", " + birthday.toString() + ", " + salary;
	}

}
