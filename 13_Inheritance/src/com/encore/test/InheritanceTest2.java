package com.encore.test;

import com.encore.child.Student;
import com.encore.child.Teacher;

public class InheritanceTest2 {

	public static void main(String[] args) {
		Student s1 = new Student("박나래", "방배동", 33, 111);
		Teacher t1 = new Teacher("강호동", "신사동", 44, "연기");
		
		
		
		System.out.println(s1);
		System.out.println(t1);

	}
}
