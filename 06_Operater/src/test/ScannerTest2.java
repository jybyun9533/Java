package test;

import java.util.Scanner;

/*
 * Scanner Ŭ����
 * �����(�����Ͻð� �ƴ�) �ܼ�â���κ��� ���� �Է¹޴� ����� ���� Ŭ����
 * 
 */

public class ScannerTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű����� ���� 2���� �Է��Ͻÿ� >>>");
	
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		System.out.println("����� �̸���?");
		String name = sc.next();
		
		System.out.println("i : " + i + ", j : " + j);
		System.out.println(name);
		
			
	}

}
