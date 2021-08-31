package sample;

/*
 * 필드에 값을 입력하는 기능을 추가
 * 
 * [simple | detail(o)]
 * setInfo()
 * inputField()
 * 
 */

public class MyStudent2 {

	public String name, address;
	public int age;
	
	public void setField(String n, int a, String add) {
		name = n;
		age = a;
		address = add;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}

}
