package com.encore.test;

import java.util.Scanner;

public class IfGradeTest1 {
	/*
	 * ��� : ������ �����Ҷ��� ������ �����ϵ��� �����ϴ� ���� 1) if / if~else / else ���� 2)
	 * - if /if else 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���輺���� �Է��Ͻÿ�>>>");

		int score = sc.nextInt();

		if (score < 100 && score >= 90) { // 90~100
			System.out.println("A grade...");
		} else if (score < 90 && score >= 80) {
			System.out.println("B grade...");
		} else if (score < 80 && score >= 70) {
			System.out.println("C grade...");
		} else if (score < 70 && score >= 60) {
			System.out.println("d grade...");
		} else
			System.out.println("Try Again...");

	}

}
