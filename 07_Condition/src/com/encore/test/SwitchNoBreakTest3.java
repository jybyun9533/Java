package com.encore.test;

public class SwitchNoBreakTest3 {

	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;

		System.out.println("[����ð� : " + time + " ��]");

		switch (time) {

		case 8:
			System.out.println("��� �غ�");
		case 9:
			System.out.println("ȸ�� ����, ���� ȸ��");
		case 10:
			System.out.println("���� ����");
		case 11:
			System.out.println("�ܱ�");
		}
	}

}
