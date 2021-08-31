package com.encore.cons.test;

/*
 * # 기본 생성자
 *  - 인자값이 없고 {}안에서 아무런 동작도 하지 않는 생성자
 * 
 * # 생성자
 *  - 객체가 생성될 때마다 구동(호출)되는 것.
 */

import com.encore.cons.Shirt;

public class ShirtTest {

	public static void main(String[] args) {
		Shirt longT = new Shirt("나이키", 120.0, true);
		Shirt halfT = new Shirt("아디다스", 125.0, true);
		
		System.out.println(longT.getDetails());
		System.out.println(halfT.getDetails());

	}

}
