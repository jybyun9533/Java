package poly.test;
/*
 * Singletone Pattern
 * �ϳ��� Ŭ�����κ��� �ϳ��� ��ü�� �����ϵ��� �ϴ� ����
 * 1. Ŭ���� �ȿ��� �ϴ� ��ü �ϳ��� ����
 * 	private static ��ü�� �����Ѵ�.
 * 2. �ٸ�������(�ٸ�Ŭ����)�� ��ü ������ ���� ���ϵ��� ���Ƶд�.
 * 	private ������(){}
 * 3. �������� �ϳ��� ��ü�� ��𼭵��� ������ ���� �ֵ��� public�� �޼ҵ带 �����д�.
 * -----------------------------------------------------------------
 */

class EncoreCompany {

	private String companyName;
	// 1.
	static private EncoreCompany encore = new EncoreCompany();

	// 2.
	private EncoreCompany() {
		companyName = "Encore";
		System.out.println("Company Name..." + companyName);
	}

	// 3.
	public static EncoreCompany getCompany() {
		return encore;
	}
}// class

public class SingletoneTest {

	public static void main(String[] args) {
//		EncoreCompany a =new EncoreCompany();
		EncoreCompany encore1 = EncoreCompany.getCompany();
		EncoreCompany encore2 = EncoreCompany.getCompany();
		EncoreCompany encore3 = EncoreCompany.getCompany();
		
		System.out.println(encore1);
		System.out.println(encore2);
		System.out.println(encore3);

	}

}
