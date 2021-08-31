
package thread.step3.test;

import java.awt.Toolkit;

/* Thread
 * 1) main Thread(���� ������)..O
 * 2) �۾� ������..X
 * 
 * �ش� �ڵ忡���� ������ ������ Ŭ������ �ۼ����� ���� ���̴�.
 * main ������(���� ������)�� ����Ǵ� Process �ڵ带 �ۼ��� ���̴�.
 * --> Single Thread
 * 
 * Beep(����� �߻�) + ������� �ܼ�â���� ���
 */

public class BeepPrintTest1 {
	public static void main(String[] args) {
		Toolkit tool = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

	}
}
