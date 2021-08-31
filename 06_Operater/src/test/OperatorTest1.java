package test;

public class OperatorTest1 {

	public static void main(String[] args) {

		int i = 3;
		int j = 5;

		Operator o1 = new Operator();
		Operator o2 = new Operator();

		// [ == | != ]
		/*
		 * System.out.println(o1); System.out.println(o2); System.out.println(o1 == o2);
		 * 
		 * System.out.println("연산자 % :: " + i % j); System.out.println(i == j);
		 * System.out.println(i != j);
		 */

		// [ ++a | a++ ]
		/*
		 * int k = 10; System.out.println(k++); System.out.println(k);
		 * 
		 * int m = 10; System.out.println(++m); System.out.println(m);
		 */

		// 논리 연산자
		// 결과 상관없이 앞뒤 연산 다함
		System.out.println(o1.test1() | o1.test2());
		System.out.println();
		System.out.println(o1.test1() & o1.test2());
		
		System.out.println("======================");
		
		// Short Circuit 
		// 앞의 연산자가 true이면 뒤에까지 수행안함.
		// 빠르고, 예외를 건너뛸수 있음.
		System.out.println(o1.test1() || o1.test2());
		System.out.println();
		System.out.println(o1.test1() && o1.test2());

	}

}

class Operator {

	public boolean test1() {
		System.out.println("test1() Calling...");
		return true;

	}

	public boolean test2() {
		System.out.println("test2() Calling...");
		return false;

	}
}
