package com.encore.cons.test;

import com.encore.cons.Programmer;
import com.encore.util.MyDate;

public class ProgrammerTest {

	public static void main(String[] args) {

		/*
		 * step1.
		 * 
		 * Programmer pro = new Programmer(); Programmer pro1 = new Programmer();
		 * 
		 * MyDate md = new MyDate(); md.setDate(1980, 1, 1);
		 * 
		 * pro.setProgrammer("변준영", md, 100.0f, 50);
		 * System.out.println(pro.getProgrammer());
		 * 
		 * pro1.setProgrammer("변준영1", md, 200.0f, 10);
		 * System.out.println(pro1.getProgrammer());
		 */

		/*
		 * step2.
		 * 
		 * pro1, pro2 객체를 생성 생성자를 이용해서 필드에 직접 값을 할당 필드 정보를 콘솔창으로 출력 'peter의 연봉은
		 * 450000.0달러 입니다' 출력
		 */

		Programmer pro1 = new Programmer("Peter", new MyDate(1090, 1, 1), 450000, 500);
		Programmer pro2 = new Programmer("James", new MyDate(1090, 1, 1), 550000, 1000);

		System.out.println(pro1.name + "의 연봉은 " + pro1.getSalary() + "달러 입니다.");
		System.out.println(pro2.name + "의 연봉은 " + pro2.getSalary() + "달러 입니다.");
	}

}
