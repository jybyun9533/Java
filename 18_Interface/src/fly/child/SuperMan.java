package fly.child;

import fly.parent.Flyer;

/*
 * �������̽��� �θ�� �� �ڽ� Ŭ������
 * �ݵ�� �θ� �������̽��� ������ �ִ� ��� �߻�޼ҵ带 �� �����ؾ��Ѵ�. 
 */

public class SuperMan implements Flyer {

	@Override
	public void fly() {
		System.out.println("SuperMan fly");

	}

	@Override
	public void land() {
		System.out.println("SuperMan land");

	}

	@Override
	public void takeOff() {
		System.out.println("SuperMan tekeOff");

	}
	
	// �ڽŸ��� �޼ҵ�
	public String stop_Bullet() {
		return "�Ѿ��� ����";
	}

}
