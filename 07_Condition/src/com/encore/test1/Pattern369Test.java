package com.encore.test1;

import java.util.Scanner;

/*
 * Scanner 객체를 통해서 10~99사이의 정수를 입력받는다(2자리)
 * 3,6,9가 들어간 숫자는 @로 표시 (33이면 @@으로 표시)
 * 
 * 힌트
 * -> 2자리 수 일때, 십의자리는 /, 일의자리는 %로 구할수 있음.
 */
public class Pattern369Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num < 10 || num > 99) {
			System.err.println("두자리 정수를 입력해주세요.");
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
