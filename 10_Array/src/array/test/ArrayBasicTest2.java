package array.test;

/*
 * 1. 배열은 Resizing할수 없다.
 *  처음 잡은 사이즈를 변경하게 되면 새로운 배열이 생성됨.
 *  
 * 2. 배열은 객체다.
 *  new 키워드를 통해 생성. -> heap에 올라감
 *  하지만 Class Type이 존재하지 않는다.
 *  length라는 필드를 반드시 기억하자
 *  배열안의 데이터의 개수를 리턴하는 필드에 해당한다.
 *  
 * 3. 배열은 ReSizing은 안되지만,
 * 사이즈가 다른 배열의 데이터를 복사해 와서 사용할 수 있다.
 * 
 *     
 */

public class ArrayBasicTest2 {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33 };
		System.out.println("메모리 :: " + arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n=====================");
		// 뒤늦게 값이 생겨 추가할 경우
		arr = new int[5];
		arr[3] = 44;
		arr[4] = 55;

		System.out.println("메모리 :: " + arr);
		for (int i = 0; i < arr.length; i++) {

		}

		System.out.println("\n=========arrayCopy()=========");
		int[] target = { 1, 2, 3, 4, 5, 6 };
		int[] source = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		System.arraycopy(source, 3, target, 0, 4);

		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + " ");
		}
	}
}
