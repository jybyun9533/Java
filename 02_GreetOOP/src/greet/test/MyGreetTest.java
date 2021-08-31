package greet.test;

import greet.MyGreet;
import sample.MyStudent;

/*
 * MyGreet 클래스의 메소드를 동작시키는 실행 클래스
 * Test클래스
 * 
 * 1. 클래스 객체를 생성 == 식구(구성요소)들이 메모리에 올라간다
 * 2. 접근
 *  1) 필드  --- 값 할당  
 *  2) 메소드 --- 호출(Calling)
 */

public class MyGreetTest {

	public static void main(String[] args) {

		
		MyGreet mg = new MyGreet(); // 객체 생성
		mg.sayHello("변준영"); // method calling
		
		

	}

}
