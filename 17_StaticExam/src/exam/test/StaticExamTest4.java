package exam.test;

/*
 * Modifier -> Access modifier | Usage Modifier
 * Usage Modifier :: static, final, abstract
 * static + fianl �ַ� �Բ� ���� ���δ�.
 * 
 * final :: "���� �������̾�"�� �ǹ��ϴ� Ű����
 * final + ���� --> "���� ������ ������" --> �������
 * final + Ŭ���� --> "���� ������ Ŭ����" --> ��ӱ���
 * final + �޼ҵ� --> "���� ������ �޼ҵ��" --> �������̵� ����
 */

class A {
	public final static int BASE_SALARY = 300; // ����� ��Ÿ���� ���� �빮��+�����

	public final String test() {
		return " Overriding ����";
	}
}

final class B { // ��� X

}

/*
 * class C extends B { // �����߻� }
 */


public class StaticExamTest4 {
	public static void main(String[] args) {

	}

}
