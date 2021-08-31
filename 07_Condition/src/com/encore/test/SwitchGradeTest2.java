package com.encore.test;

import java.util.Scanner;

/*
 * - switch : 해당하는 Case의 문장을 실행하도록 제어
 */
public class SwitchGradeTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 시험성적을 입력하시오>>>");

		int score = sc.nextInt();
		
		switch(score) {
		case 90:
		case 95:
		case 100:
			System.out.println("A..");
			break;

		case 80:
		case 85:
			System.out.println("B..");
			break;
			
		case 70:
		case 75:
			System.out.println("C..");
			break;
		
		default :
			System.out.println("Try Again");
					
		}
		System.out.println("switch문을 빠져나옵니다.");
		
	}

}
