package fly.child;

import fly.parent.Flyer;

/*
 * �������̽��� �θ�� �� �ڽ� Ŭ������
 * �ݵ�� �θ� �������̽��� ������ �ִ� ��� �߻�޼ҵ带 �� �����ؾ��Ѵ�. 
 */

public class Airplane implements Flyer {

	@Override
	public void fly() {
		System.out.println("Airplane fly");

	}

	@Override
	public void land() {
		System.out.println("Airplane land");

	}

	@Override
	public void takeOff() {
		System.out.println("Airplane tekeOff");

	}

}
