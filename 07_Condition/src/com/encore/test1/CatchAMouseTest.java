package com.encore.test1;

import java.util.Scanner;

public class CatchAMouseTest {

	private static String algoSolv(int catA, int catB, int mouse) {
		String answer = "";

		int aDistance = Math.abs(catA - mouse);
		int bDistance = Math.abs(catB - mouse);

		if (aDistance > bDistance) {
			answer = "catB";
		} else if (aDistance < bDistance) {
			answer = "catA";
		} else {
			return "Mouse escapes!!";
		}

		return answer + " catch!";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int catA = sc.nextInt();
		int catB = sc.nextInt();
		int mouse = sc.nextInt();

		String result = algoSolv(catA, catB, mouse);
		
		System.out.println(result);

	}

}
