package exam.test;
/*
 *  #### Static한 키워드 성질 ####
 *  1. 객체생성 과정 없이 메모리에 올라간다.
 *  2. 객체생성 과정 훨씬 이전인 Class File Loader과정때 메모리에 올라간다
 *     JVM(STACK|HEAP(new키워드로 생성된 객체만)|....Class Area(static한 성징들의 멤버))
 *  3. ★static한 성질의 필드는 생성된 객체들에서 서로 공유한다.★
 *  4. static은 static끼리 통한다
 *  5. static 블락 안에서는 this 사용이 안된다.
 *  6. static과 final은 성질상 종종 함께 사용된다. 
 *     ex) 상수값 선언 : static final int BASIC_SALARY = 1000;
 *  7. static initialization block
 *  8. 싱글톤
 */

class Member {
	// 필드 레벨에 static 변수를 선언(local level로는 사용할수 없다.)
	static String name = "홍길동";
	static int age = 22;

	int count = 1;

	public static void getMember() { // static block
		System.out.println("우/유/빛/깔/ " + name); //static variable
		//System.out.println("우/유/빛/깔/ " + count); 
	}
	
	public void getMember2() { // non-static block
		System.out.println("우/유/빛/깔/ " + name); //static variable
		System.out.println("우/유/빛/깔/ " + count); 
	}
}

public class StaticExamTest1 {

	public static void main(String[] args) {
		//static한 성질의 기능은 바로 접근해서 사용할수 있다. Class.Method.
		Member.getMember();

		Member m = new Member();
		m.getMember();
		
	}

}
