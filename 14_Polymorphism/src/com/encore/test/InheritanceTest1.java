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

		// Robert가 부서를 바꾼다 IT -> Marketing
		m.changeDept("Marketing");

		System.out.println(emp.getDetails());
		System.out.println(m.getDetails());
		System.out.println(eg.getDetails());
		System.out.println(ss.getDetails());

		////// 다형성 //////
		// 부모타입으로 자식을 생성한다
		System.out.println("\n==============polymorphism=================");

		Employee e1 = new Manager("Robert1", new MyDate(1981, 4, 2), 33000, "IT1");
		//Employee e2 = new Engineer("Gosling1", new MyDate(1978, 1, 2), 33000, "Python");
		Employee e3 = new Secretary("Peter1", new MyDate(1988, 1, 2), 34000, "Robert1");

		/*
		 * 1. Virtual Method(생성된 자식의 메소드) Invocation 원리 상속관계의 2개의 클래스에서 
		 * 메소드 오버라이딩을 했을때 발생하는 원리
		 * Compile Type Time 메소드 : 부모 메소드가 호출 
		 * Runtime Type 메소드 : 자식 메소드 호출
		 * 
		 * 2. Object Casting 기법 필요. 
		 * 부모로 찾으면 안되고, 자식변수로 찾아야 함.(자식만의 기능)
		 */
		

		/* 두줄에 나눠 구현
		 * Manager m1 = (Manager) e1; 
		 * m1.changeDept("Marketing");
		 */
		
		// 한번에 작성
		((Manager) e1).changeDept("Marketing");
		
		System.out.println(e1.getDetails());
		System.out.println(e2.getDetails());
		System.out.println(e3.getDetails());

	}
}
