package array.test;

import java.util.Arrays;
import java.util.Random;

/*
 * Sorting --- 정렬
 * 배열과 같은 자료구조에 있어서는 3,5,7,3,11,2
 * 정렬에 대한 요구사항이 빈번하게 일어난다.
 * 정렬이란?
 * 정렬전 {3,6,1,2,8,9} --> 오름차순 정렬후 {1,2,3,6,8,9}
 * 정렬 | 순서
 * 
 * ::
 * Bubble Sorting -- 버블정렬
 * 정렬을 구현하기 위한 알고리즘 중에서 가장 대표적인 알고리즘
 * 
 *  - 방법
 *  인접한 두 수를 비교해서 큰 수를 뒤로 보내는 방법
 *  -> temp라는 임시변수를 하나 만들어서 뒤로보냄.
 */

public class ArraySortingTest4 {

	public static void main(String[] args) {
		Random r = new Random();
		// int a = r.nextInt();

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10); // 0~9 임의의 정수값
		}

		System.out.println("===Array의 초기화 완료 ===");

		for (int i : arr) {
			System.out.print(i + " ");
		}

		Arrays.sort(arr);
	

		System.out.println("\n======정렬완료======");
		for (int i : arr)
			System.out.print(i + " ");

	}

}
