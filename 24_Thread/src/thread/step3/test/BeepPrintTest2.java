
package thread.step3.test;

import java.awt.Toolkit;

/* ������� ����ϴ� �۾��� �����ؼ� ó���ϵ��� ���� �ۼ�
 * -->
 * ������� ����ϴ� �۾��� ������� �����
 * BeepPrintThread�ϳ� �ۼ�
 * BeepPrintTest2�ּ� �����۾��� �ɼ��ֵ����Ѵ�
 */

class BeepPrintThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}

}

public class BeepPrintTest2 {
	public static void main(String[] args) {

		BeepPrintThread pth = new BeepPrintThread();
		Thread th = new Thread(pth);

		Toolkit tool = Toolkit.getDefaultToolkit();
		th.start();
		
		for (int i = 0; i < 5; i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

	}
}
