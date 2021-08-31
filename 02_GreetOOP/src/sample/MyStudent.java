package sample;

/*
 * 1) 필드
 * 이름, 나이, 주소에 해당하는 값이 들어갈수 있도록
 * 필드 3개를 선언
 * 
 * 2) 메소드
 * 3개의 필드 정보들이 콘솔창에 출력될 수 있도록 정의
 */

public class MyStudent {

	public String name, address;
	public int age;
	
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}

}
