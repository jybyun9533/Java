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
		//Engineer eg = new Engineer("Gosling", new MyDate(1978, 1, 2), 33000, "Java");
		Secretary ss = new Secretary("Peter", new MyDate(1988, 1, 2), 34000, "Robert");

		// Robert�� �μ��� �ٲ۴� IT -> Marketing
		m.changeDept("Marketing");

		System.out.println(emp.getDetails());
		System.out.println(m.getDetails());
		System.out.println(eg.getDetails());
		System.out.println(ss.getDetails());

		////// ������ //////
		// �θ�Ÿ������ �ڽ��� �����Ѵ�
		System.out.println("\n==============polymorphism=================");

		Employee e1 = new Manager("Robert1", new MyDate(1981, 4, 2), 33000, "IT1");
		//Employee e2 = new Engineer("Gosling1", new MyDate(1978, 1, 2), 33000, "Python");
		Employee e3 = new Secretary("Peter1", new MyDate(1988, 1, 2), 34000, "Robert1");

		/*
		 * 1. Virtual Method(������ �ڽ��� �޼ҵ�) Invocation ���� ��Ӱ����� 2���� Ŭ�������� 
		 * �޼ҵ� �������̵��� ������ �߻��ϴ� ����
		 * Compile Type Time �޼ҵ� : �θ� �޼ҵ尡 ȣ�� 
		 * Runtime Type �޼ҵ� : �ڽ� �޼ҵ� ȣ��
		 * 
		 * 2. Object Casting ��� �ʿ�. 
		 * �θ�� ã���� �ȵǰ�, �ڽĺ����� ã�ƾ� ��.(�ڽĸ��� ���)
		 */
		

		/* ���ٿ� ���� ����
		 * Manager m1 = (Manager) e1; 
		 * m1.changeDept("Marketing");
		 */
		
		// �ѹ��� �ۼ�
		((Manager) e1).changeDept("Marketing");
		
		System.out.println(e1.getDetails());
		System.out.println(e2.getDetails());
		System.out.println(e3.getDetails());

	}
}
