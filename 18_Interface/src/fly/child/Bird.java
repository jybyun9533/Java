package fly.child;

import fly.parent.Flyer;

/*
 * �������̽��� �θ�� �� �ڽ� Ŭ������
 * �ݵ�� �θ� �������̽��� ������ �ִ� ��� �߻�޼ҵ带 �� �����ؾ��Ѵ�. 
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
	
	// �ڽŸ��� �޼ҵ�
	public String layEggs() {
		return "���� ���� ����";
	}

}
