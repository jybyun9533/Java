package com.encore.algo.test;
/*
 * 02_javaWorkshop ����� �귦�� Ŀ��
 */

import java.util.Scanner;

public class ArrayPersonTypeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[] people = new int[num];

		for (int i = 0; i < people.length; i++) {
			people[i] = sc.nextInt();
		}

		int[] type = new int[5];

		for (int i = 0; i < people.length; i++) {
			type[people[i] - 1]++;
		}

		int max = type[0], index = 0;

		for (int i = 0; i < type.length; i++) {
			if (max < type[i]) {
				max = type[i];
				index = i;
			}
		}
		
		System.out.println("���� ���� ������ : " + (index+1)+" �Դϴ�. ");
	}

}
