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
		 * System.out.println("������ % :: " + i % j); System.out.println(i == j);
		 * System.out.println(i != j);
		 */

		// [ ++a | a++ ]
		/*
		 * int k = 10; System.out.println(k++); System.out.println(k);
		 * 
		 * int m = 10; System.out.println(++m); System.out.println(m);
		 */

		// �� ������
		// ��� ������� �յ� ���� ����
		System.out.println(o1.test1() | o1.test2());
		System.out.println();
		System.out.println(o1.test1() & o1.test2());
		
		System.out.println("======================");
		
		// Short Circuit 
		// ���� �����ڰ� true�̸� �ڿ����� �������.
		// ������, ���ܸ� �ǳʶۼ� ����.
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
