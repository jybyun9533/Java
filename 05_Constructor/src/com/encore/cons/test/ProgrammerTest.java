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
		 * pro.setProgrammer("���ؿ�", md, 100.0f, 50);
		 * System.out.println(pro.getProgrammer());
		 * 
		 * pro1.setProgrammer("���ؿ�1", md, 200.0f, 10);
		 * System.out.println(pro1.getProgrammer());
		 */

		/*
		 * step2.
		 * 
		 * pro1, pro2 ��ü�� ���� �����ڸ� �̿��ؼ� �ʵ忡 ���� ���� �Ҵ� �ʵ� ������ �ܼ�â���� ��� 'peter�� ������
		 * 450000.0�޷� �Դϴ�' ���
		 */

		Programmer pro1 = new Programmer("Peter", new MyDate(1090, 1, 1), 450000, 500);
		Programmer pro2 = new Programmer("James", new MyDate(1090, 1, 1), 550000, 1000);

		System.out.println(pro1.name + "�� ������ " + pro1.getSalary() + "�޷� �Դϴ�.");
		System.out.println(pro2.name + "�� ������ " + pro2.getSalary() + "�޷� �Դϴ�.");
	}

}
