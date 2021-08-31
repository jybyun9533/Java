package poly.test;
/*
 * Singletone Pattern
 * 하나의 클래스로부터 하나의 객체만 생성하도록 하는 패턴
 * 1. 클래스 안에서 일단 객체 하나는 생성
 * 	private static 객체를 생성한다.
 * 2. 다른곳에서(다른클래스)는 객체 생성을 하지 못하도록 막아둔다.
 * 	private 생성자(){}
 * 3. 만들어놓은 하나의 객체를 어디서든지 가져다 쓸수 있도록 public한 메소드를 만들어둔다.
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
