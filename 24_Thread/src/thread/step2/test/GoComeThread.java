package thread.step2.test;

/*
 * Runnable �������̽��� �����ؼ� Thread�� ���� 
 */
class GoThread implements Runnable {

	// �����带 ����� ������ run() �����.
	public void run() { // �����尡 �۵��ϴ� �κ�
		int i = 0;
		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// ���� �������� �������� �̸�
			String tName = Thread.currentThread().getName();
			System.out.println(tName + " : " + i++);
			if (i == 20) {
				break;
			}
		}
	}

}

class ComeThread implements Runnable {
	public void run() { // �����尡 �۵��ϴ� �κ�
		int i = 0;
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// ���� �������� �������� �̸�
			String tName = Thread.currentThread().getName();
			System.out.println(tName + " : " + i++);
			if (i == 20) {
				break;
			}
		}
	}
}

public class GoComeThread {
	public static void main(String[] args) {
		// GoComeThread��� ���μ��� �ȿ��� 2���� �����带 ���۽�Ų��.
		GoThread go = new GoThread();
		ComeThread come = new ComeThread();

		Thread t1 = new Thread(go, "GoThread");
		Thread t2 = new Thread(come, "ComeThread");

		t1.start();
		t2.start();

	}

}
