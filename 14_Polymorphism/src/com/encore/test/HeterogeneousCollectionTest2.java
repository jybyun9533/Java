package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.MyDate;

/*
 * Colletion
 * 1. Homegeneous Collection (동종간의 집합체)
 * 2. Heterogeneous Collection (이기종간의 집합체)
 */

public class HeterogeneousCollectionTest2 {
	public static void main(String[] args) {

		Employee[] emps = { new Employee("James", new MyDate(1995, 03, 03), 23000.0),
				new Manager("Robert", new MyDate(1981, 4, 2), 33000, "IT"),
				new Engineer("Gosling", new MyDate(1978, 1, 2), 33000, "Java", 200),
				new Secretary("Peter", new MyDate(1988, 1, 2), 34000, "Robert") };

		for (Employee e : emps) {
			System.out.println(e.getDetails());
		}

		System.out.println("===모든 고용인들의 연봉을 출력합니다.===\n");
		int total = 0;
		for (Employee e : emps) {
			if (e instanceof Engineer) {
				System.out.println("Info : " + e.getDetails());
				System.out.println("AnnualSalary :: " + ((e.getSalary() * 12) + ((Engineer) e).getBonus()) + "\n");
			} else {
				System.out.println("Info : " + e.getDetails());
				System.out.println("AnnualSalary :: " + e.getSalary() * 12 + "\n");
			}
		}

	}
}
