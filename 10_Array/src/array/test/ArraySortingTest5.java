package array.test;

import java.util.Random;

/*
 * Sorting --- ����
 * �迭�� ���� �ڷᱸ���� �־�� 3,5,7,3,11,2
 * ���Ŀ� ���� �䱸������ ����ϰ� �Ͼ��.
 * �����̶�?
 * ������ {3,6,1,2,8,9} --> �������� ������ {1,2,3,6,8,9}
 * ���� | ����
 * 
 * ::
 * Bubble Sorting -- ��������
 * ������ �����ϱ� ���� �˰��� �߿��� ���� ��ǥ���� �˰���
 * 
 *  - ���
 *  ������ �� ���� ���ؼ� ū ���� �ڷ� ������ ���
 *  -> temp��� �ӽú����� �ϳ� ���� �ڷκ���.
 */

public class ArraySortingTest5 {

	public static void main(String[] args) {
		Random r = new Random();
		// int a = r.nextInt();

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10); // 0~9 ������ ������
		}

		System.out.println("===Array�� �ʱ�ȭ �Ϸ� ===");

		for (int i : arr) {
			System.out.print(i + " ");
		}

		int temp = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("\n======���ĿϷ�======");
		for (int i : arr)
			System.out.print(i + " ");

	}

}
