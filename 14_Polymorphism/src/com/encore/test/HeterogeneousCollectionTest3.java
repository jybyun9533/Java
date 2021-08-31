package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class HeterogeneousCollectionTest3 {
	public static void main(String[] args) {

		Employee[] emps = { new Employee("James", new MyDate(1995, 03, 03), 23000.0),
				new Manager("Robert", new MyDate(1981, 4, 2), 33000, "IT"),
				new Engineer("Gosling", new MyDate(1978, 1, 2), 33000, "Java", 200),
				new Secretary("Peter", new MyDate(1988, 1, 2), 34000, "Robert") };

		/*
		 * for���� instanceof ������ؼ� Robert �μ��� IT -> Marketing Gosling tech Java -> Python
		 * Peter bossOfName Robert -->Gosling
		 */

		for (Employee e : emps) {
			if (e instanceof Manager) {
				((Manager) e).changeDept("Marketing");
			}

			if (e instanceof Engineer) {
				((Engineer) e).changeTech("Phthon");
			}
			if (e instanceof Secretary) {
				((Secretary) e).changeBossOfName("Gosling");
			}
			
			System.out.println(e.getDetails());
		}//for
	}//main
}//class

/*
 * Polymorphism
 * 1. HeteroCollection
 * 2. Virtual Method Invocation
 * 3. Object Casting
 * 4. �θ�Ÿ������ �����ϰ� ������ ������ ���� ���������� ������ ��üŸ���� �˾Ƴ������� Ű����
 * if (e instanceof �ڽ�Ŭ������)
 */ 

