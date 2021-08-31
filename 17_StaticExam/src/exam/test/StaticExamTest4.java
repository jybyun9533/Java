package exam.test;

/*
 * Modifier -> Access modifier | Usage Modifier
 * Usage Modifier :: static, final, abstract
 * static + fianl 주로 함께 많이 쓰인다.
 * 
 * final :: "내가 마지막이야"를 의미하는 키워드
 * final + 변수 --> "내가 마지막 변수야" --> 상수지정
 * final + 클래스 --> "내가 마지막 클래스" --> 상속금지
 * final + 메소드 --> "내가 마지막 메소드야" --> 오버라이딩 금지
 */

class A {
	public final static int BASE_SALARY = 300; // 상수를 나타내는 것은 대문자+언더바

	public final String test() {
		return " Overriding 금지";
	}
}

final class B { // 상속 X

}

/*
 * class C extends B { // 에러발생 }
 */


public class StaticExamTest4 {
	public static void main(String[] args) {

	}

}
