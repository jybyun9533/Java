package thread.step4.test;

import javax.swing.JOptionPane;

/*
 * 작업쓰레드를 사용
 * 로또번호 입력작업과 동시에 카운팅 작업이 진행되도록 로직을 작성
 * 
 * <방법>
 * 작업쓰레드를 하나 추가한다.
 * CountingThread를 새롭게 하나 정의
 * --> 로또번호 입력과 Counting작업이 병렬적으로 처리되도록 로직을 완성
 */

class CountingThread extends Thread {
	public void run() {

		// 2. 일종의 카운팅 작업(10,9,8,...,1)
		for (int i = 10; i >= 1; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.println(i);
		}
	}
}

public class InputThreadTest2 {
	public static void main(String[] args) {
		CountingThread th = new CountingThread();
		th.start();

		// 1. 데이터 입력 작업..GUI
		String input = JOptionPane.showInputDialog("최종 로또 번호 마지막자리 숫자를 입력하시오.");
		System.out.println("입력한 숫자 : " + input);

	}

}
