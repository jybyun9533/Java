package sample.test;

import sample.MyStudent2;

/*
 * MyStudentTest.java�� ������
 * �л����� �þ������
 * ������ �ʵ忡 �ش��ϴ� ���� ���� �־���� ��.
 * 
 * ���α׷��� �ۼ��� ���� ���� �ϵ��ڵ� �Ǿ����� �ȵ�.
 * -> �ذ�å
 * 1) �ʵ忡 ���� ���� ������ �ȵȴ�.
 * 2) ���� �ʵ忡 �ԷµǴ� ����� ���Ӱ� �ϳ� ����
 */

public class MyStudentTest2 {

	public static void main(String[] args) {
		/*
		 * 1. MyStudent2 ��ü�� 3�� ���� m1, m2, m3�̸�
		 * 2. ������ ��ü�� ���� �Ҵ� -> �ʵ� �ʱ�ȭ 
		 */
		
		MyStudent2 m1 = new MyStudent2();
		m1.setField("���ؿ�1", 1, "��⵵1");
		
		MyStudent2 m2 = new MyStudent2();
		m2.setField("���ؿ�2", 2, "��⵵2");
		
		MyStudent2 m3 = new MyStudent2();
		m3.setField("���ؿ�3", 3, "��⵵3");
		
		m1.printInfo();
		System.out.println();
		m2.printInfo();
		System.out.println();
		m3.printInfo();
		
	}

}
