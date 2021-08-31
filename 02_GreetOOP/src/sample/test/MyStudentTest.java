package sample.test;

import sample.MyStudent;

/*
 * MyStudent 객체 생성 : ms
 * MyStudent의 메소드의 동작
 */

public class MyStudentTest {

	public static void main(String[] args) {
		
		MyStudent ms = new MyStudent(); // 객체를 생성
		
		ms.name = "변준영";
		ms.age = 27;
		ms.address = "경기도";
		ms.printInfo();

	}

}
