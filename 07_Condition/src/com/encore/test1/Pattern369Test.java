package com.encore.test1;

import java.util.Scanner;

/*
 * Scanner ��ü�� ���ؼ� 10~99������ ������ �Է¹޴´�(2�ڸ�)
 * 3,6,9�� �� ���ڴ� @�� ǥ�� (33�̸� @@���� ǥ��)
 * 
 * ��Ʈ
 * -> 2�ڸ� �� �϶�, �����ڸ��� /, �����ڸ��� %�� ���Ҽ� ����.
 */
public class Pattern369Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num < 10 || num > 99) {
			System.err.println("���ڸ� ������ �Է����ּ���.");
			System.exit(0);
		}

		int fst, sec;
		fst = num / 10;
		sec = num % 10;

		String answer = "";

		if (fst == 3 || fst == 6 || fst == 9) {
			answer += "@";
		} else {
			answer += fst;
		}

		if (sec == 3 || sec == 6 || sec == 9) {
			answer += "@";
		} else {
			answer += sec;
		}
		
		System.out.println(answer);
			

	}

}
