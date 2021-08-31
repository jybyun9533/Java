package thread.step4.test;

import javax.swing.JOptionPane;

/*
 * 카운팅작업 - CountThread
 * 숫자입력작업 - LottoInputThread
 * ::
 * 두개의 쓰레드가 Process안에서 서로 리소스를 공유하면서 도는 상황을 로직으로 작성
 * 카운팅되는 상황을 서로 공유하도록 로직을 작성
 * ::
 * 1. 카운트가 다 끝나도록 숫자입력이 안되면 : 해당 프로그램을 종료
 * 2. 카운트 진행도중에서 숫자가 입력되면 - 더이상 카운팅을 진행하지 않도록 한다.
 */

class CountThread implements Runnable { // 카운팅 작업
	InputThreadTest3 process;

	public CountThread(InputThreadTest3 process) {
		super();
		this.process = process;
	}

	public void run() {
		for (int i = 10; i >= 1; i--) {
			if (process.inputCheck) {
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.println(i);
		}
		if (!process.inputCheck) {
			System.out.println("10초가 경과되었습니다.");
			System.exit(0);
		}
	}
}

class LottoInputThread implements Runnable { // 숫자 입력작업
	InputThreadTest3 process;

	public LottoInputThread(InputThreadTest3 process) {
		super();
		this.process = process;
	}

	public void run() {
		String input = JOptionPane.showInputDialog("최종 로또 번호 마지막자리 숫자를 입력하시오.");
		System.out.println("입력한 숫자 : " + input);

		process.inputCheck = true;
	}
}

public class InputThreadTest3 {
	// 필드 :: 쓰레드간 자원 공유
	boolean inputCheck = false;

	public static void main(String[] args) {
		InputThreadTest3 process = new InputThreadTest3();
		
		CountThread c = new CountThread(process);
		LottoInputThread l = new LottoInputThread(process);

		Thread cth = new Thread(c);
		Thread lth = new Thread(l);

		cth.start();
		lth.start();

	}

}
