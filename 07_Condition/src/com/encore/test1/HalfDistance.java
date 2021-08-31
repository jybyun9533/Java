package com.encore.test1;

import java.util.Scanner;

/*
 * A --- 4
 * 1-2-3-4
 * 
 * B --- 8
 * 1-2-3-4-5-6-7-8
 */

public class HalfDistance {

	/*
	 * 1��) n���� 1���� ���ݾ� ���µ� ���� Ƚ���� ���� private static int halfDistance(int kims, int
	 * lims) {
	 * 
	 * int count = 0;
	 * 
	 * while (kims != 1 && lims != 1) { if (kims != 1) { kims /= 2; } if (lims != 1)
	 * { lims /= 2; }
	 * 
	 * if(kims==lims) count++; }
	 * 
	 * return count; }
	 */

	// 2��) ���� �ݾ� �ɾ�µ� 1���� �����µ� ���� �ɸ��� Ƚ�� == �ջ���� Ƚ��
	private static int halfDistance(int kims, int lims) {

		int kimsCount = 0;
		int limsCount = 0;

		while (kims != 1) {
			kims /= 2;
			kimsCount++;
		}
		
		while (lims != 1) {
			lims /= 2;
			limsCount++;
		}
		
		return Math.max(kimsCount, limsCount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("kims�� ����>>>");
		int kims = sc.nextInt();
		System.out.println("lims�� ����>>>");
		int lims = sc.nextInt();

		int result = halfDistance(kims, lims);

		System.out.println("���� : " + result);

	}

}
