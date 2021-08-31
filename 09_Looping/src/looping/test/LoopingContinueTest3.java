package looping.test;

/*
 * 1~100까지 숫자 중에서 홀수의 합을 출력
 * 1) 1~100까지 합을 출력
 */
public class LoopingContinueTest3 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				continue;
			sum += i;

		}
		System.out.println(sum);

	}

}
