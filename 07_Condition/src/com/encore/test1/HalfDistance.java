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
	 * 1안) n부터 1까지 절반씩 가는데 만난 횟수를 리턴 private static int halfDistance(int kims, int
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

	// 2안) 각자 반씩 걸어가는데 1에서 만나는데 까지 걸리는 횟수 == 먼사람의 횟수
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

		System.out.println("kims의 길이>>>");
		int kims = sc.nextInt();
		System.out.println("lims의 길이>>>");
		int lims = sc.nextInt();

		int result = halfDistance(kims, lims);

		System.out.println("답은 : " + result);

	}

}
