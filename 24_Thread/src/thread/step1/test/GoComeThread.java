package thread.step1.test;

/*
 * Thread Ŭ������ ��ӹ޾Ƽ� Thread�� �����.
 * Thread�� 2�� ����
 * GoThread, ComeThread
 */
class GoThread extends Thread {
	// �����带 ����� ������ run() �����.
	public void run() { // �����尡 �۵��ϴ� �κ�
		int i = 0;
		while (true) {
			System.out.println("Go" + i++);
			if (i == 20) {
				break;
			}
		}
	}

}

class ComeThread extends Thread {
	public void run() { // �����尡 �۵��ϴ� �κ�
		int i = 0;
		while (true) {
			System.out.println("Come" + i++);
			if (i == 20) {
				break;
			}
		}
	}
}

public class GoComeThread {
	public static void main(String[] args) {
		//GoComeThread��� ���μ��� �ȿ��� 2���� �����带 ���۽�Ų��.
		GoThread t1 = new GoThread();
		ComeThread t2 = new ComeThread();
		
		t1.start();
		t2.start();
		
	}

}
