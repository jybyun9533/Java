package com.encore.test;

public class WorkshopTest1 {

	public static void main(String[] args) {

		int num1 = 1;
		int a = 5;

		String answer1 = "";
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < i; j++) {
				answer1 += "\t";
			}

			for (int j = 0; j < a - i; j++) {
				answer1 += (num1 + "\t");
				num1++;
			}
			answer1 += "\n";
		}

		System.out.println("#####문제1##########");
		System.out.println(answer1);
		System.out.println("###################");

		int num2 = 1;
		int b = 5;
		int temp = 0;
		String answer2 = "";

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < (b - temp); j++) {
				if (j < temp) {
					answer2 += "\t";
				} else {
					answer2 += num2 + "\t";
					num2++;
				}
			}

			if (i < (b / 2)) {
				temp++;
			} else {
				temp--;
			}
			answer2 += "\n";
		}

		System.out.println("#####문제2##########");
		System.out.println(answer2);
		System.out.println("###################");

	}

}
