package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class InheritanceTest1 {

	public static void main(String[] args) {
		Employee emp = new Employee("James", new MyDate(1995, 03, 03), 23000.0);
		Manager m = new Manager("Robert", new MyDate(1981, 4, 2), 33000, "IT");
//		Engineer eg = new Engineer("Gosling", new MyDate(1978, 1, 2), 33000, "Java");
//		Secretary ss = new Secretary("Peter", new MyDate(1988, 1, 2), 34000, "Robert");

	}
}
