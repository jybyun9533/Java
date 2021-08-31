package sample.test;

import sample.MyStudent2;

/*
 * MyStudentTest.java의 문제점
 * 학생수가 늘어날때마다
 * 일일이 필드에 해당하는 값을 직접 넣어줘야 함.
 * 
 * 프로그램은 작성시 실제 값이 하드코딩 되어지면 안됨.
 * -> 해결책
 * 1) 필드에 값을 직접 넣으면 안된다.
 * 2) 값이 필드에 입력되는 기능을 새롭게 하나 정의
 */

public class MyStudentTest2 {

	public static void main(String[] args) {
		/*
		 * 1. MyStudent2 객체를 3개 생성 m1, m2, m3이름
		 * 2. 각각의 객체의 값으 할당 -> 필드 초기화 
		 */
		
		MyStudent2 m1 = new MyStudent2();
		m1.setField("변준영1", 1, "경기도1");
		
		MyStudent2 m2 = new MyStudent2();
		m2.setField("변준영2", 2, "경기도2");
		
		MyStudent2 m3 = new MyStudent2();
		m3.setField("변준영3", 3, "경기도3");
		
		m1.printInfo();
		System.out.println();
		m2.printInfo();
		System.out.println();
		m3.printInfo();
		
	}

}
