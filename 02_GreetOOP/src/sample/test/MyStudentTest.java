package sample.test;

import sample.MyStudent;

/*
 * MyStudent ��ü ���� : ms
 * MyStudent�� �޼ҵ��� ����
 */

public class MyStudentTest {

	public static void main(String[] args) {
		
		MyStudent ms = new MyStudent(); // ��ü�� ����
		
		ms.name = "���ؿ�";
		ms.age = 27;
		ms.address = "��⵵";
		ms.printInfo();

	}

}
