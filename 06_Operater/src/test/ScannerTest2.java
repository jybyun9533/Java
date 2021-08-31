package test;

import java.util.Scanner;

/*
 * Scanner 클래스
 * 실행시(컴파일시가 아님) 콘솔창으로부터 값을 입력받는 기능을 가진 클래스
 * 
 */

public class ScannerTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키보드로 숫자 2개를 입력하시오 >>>");
	
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		System.out.println("당신의 이름은?");
		String name = sc.next();
		
		System.out.println("i : " + i + ", j : " + j);
		System.out.println(name);
		
			
	}

}
