
package thread.step3.test;

import java.awt.Toolkit;

/* 경고음을 출력하는 작업을 병행해서 처리하도록 로직 작성
 * -->
 * 경고음을 출력하는 작업을 쓰레드로 만든다
 * BeepPrintThread하나 작성
 * BeepPrintTest2애서 동시작업이 될수있도록한다
 */

class BeepPrintThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("명");
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
