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
			System.out.println("�Է��� ��¥�� �ùٸ��� �ʽ��ϴ�.");
		} else
			System.out.println("������ " + md.getMonth() + "�� " + md.getDay() + "�� �Դϴ�.");

	}

}
