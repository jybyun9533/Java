package thread.step6.test;

/*
 * MegaBox���� �¼��� �����ϴ� ���� �����ϴ� Thread Class
 * reserve() ��� ����� ����
 *  
 */

public class MegaBoxUser implements Runnable {
	private boolean seat = false; // �¼��ڸ�

	@Override
	public void run() {
		// �¼��� �����ϴ� ���
		try {
			reserve();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}// run

	public synchronized void reserve() throws InterruptedException {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + "��, ���Ÿ� �����մϴ�.");

		if (!seat) { //���� ����
			Thread.sleep(1000);
			System.out.println(tName + "��, ���Ÿ� �����Ͽ����ϴ�.");
			seat = true;
		} else { // ���� �Ұ���
			System.out.println(tName + "��, �ش� �¼��� ���Ű� �Ϸ�� �¼��Դϴ�.");
		}

	}
}// class
