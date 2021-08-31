package fly.test;

import fly.child.Airplane;
import fly.child.Bird;
import fly.child.SuperMan;
import fly.parent.Flyer;

public class FlyerTest1 {

	public static void main(String[] args) {
		/*
		 * 1. 다형성 방식으로 자식객체를 3개 생성 (bird, airplane, superman) 
		 * 2. for, instanceof를 이용해서
		 * 자식클래스의 기능을 전부다 호출
		 */

		// Flyer flyer = new Flyer();
		// 추상메소드가 있으면 can't instantiate (객체생성X)
		// => 인터페이스는 객체생성의 대상이 아니고, 객체를 생성하기 위한 [타입]으로서만 존재한다.
		
		Flyer[] flyer = { new Bird(), new Airplane(), new SuperMan() };

		for (Flyer f : flyer) {
			f.fly();
			f.takeOff();
			f.land();

			if (f instanceof Bird) {
				System.out.println(((Bird) f).layEggs());
			} else if (f instanceof SuperMan) {
				System.out.println(((SuperMan) f).stop_Bullet());
			}
			System.out.println();
		}

	}

}
