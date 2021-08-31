package fly.parent;
// 날으는 것과 관련된 기능을 모아놓은 Interface

public interface Flyer {
	/*
	 * 필드는 없지만 상수는 존재.
	 * 1. static final 상수
	 * 2. public abstract 메소드
	 */
	public static final int SIZE = 100;
	
	public abstract void fly(); // 선언부만 있고 구현부({...})가 없는 메소드

	void land(); // 무조건 메소드 리턴타입 앞에 public abstract 생략가능

	void takeOff();

}
