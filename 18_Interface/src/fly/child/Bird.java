package fly.child;

import fly.parent.Flyer;

/*
 * 인터페이스를 부모로 둔 자식 클래스는
 * 반드시 부모 인터페이스가 가지고 있는 모든 추상메소드를 다 구현해야한다. 
 */

public class Bird implements Flyer {

	@Override
	public void fly() {
		System.out.println("Bird fly");

	}

	@Override
	public void land() {
		System.out.println("Bird land");

	}

	@Override
	public void takeOff() {
		System.out.println("Bird tekeOff");

	}
	
	// 자신만의 메소드
	public String layEggs() {
		return "새가 알을 낳다";
	}

}
