package array.test;

public class ArrayBasicTest1 {

	public static void main(String[] args) {
		// 1. �迭���� + ����
		int[] arr = new int[3];

		System.out.println("�迭�� �ּҰ� :: " + arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// 2. �ʱ�ȭ
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
