package greet;

/*
 * MyGreet 클래스는 
 * 인사말을 콘솔창으로 출력하는 기능을 가지고 있는 클래스
 */

public class MyGreet {
	public String message = "안녕하세요";

	public void sayHello(String name) { //method worker
		System.out.println(message + ", " + name);
	}
}