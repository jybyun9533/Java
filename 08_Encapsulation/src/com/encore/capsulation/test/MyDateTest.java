package com.encore.capsulation.test;

import com.encore.capsulation.MyDate;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate md = new MyDate();
		System.out.println(md);
//		md.month =13;
//		md.day = 33;

		md.setMonth(0);
		md.setDay(12);
		if (md.getMonth() == 0 || md.getDay() == 0) {
			System.out.println("입력한 날짜가 올바르지 않습니다.");
		} else
			System.out.println("오늘은 " + md.getMonth() + "월 " + md.getDay() + "일 입니다.");

	}

}
