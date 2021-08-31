package fly.test;

import fly.child.Airplane;
import fly.child.Bird;
import fly.child.SuperMan;
import fly.parent.Flyer;

public class FlyerTest1 {

	public static void main(String[] args) {
		/*
		 * 1. ������ ������� �ڽİ�ü�� 3�� ���� (bird, airplane, superman) 
		 * 2. for, instanceof�� �̿��ؼ�
		 * �ڽ�Ŭ������ ����� ���δ� ȣ��
		 */

		// Flyer flyer = new Flyer();
		// �߻�޼ҵ尡 ������ can't instantiate (��ü����X)
		// => �������̽��� ��ü������ ����� �ƴϰ�, ��ü�� �����ϱ� ���� [Ÿ��]���μ��� �����Ѵ�.
		
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
