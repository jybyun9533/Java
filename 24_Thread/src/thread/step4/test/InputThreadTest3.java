package thread.step4.test;

import javax.swing.JOptionPane;

/*
 * ī�����۾� - CountThread
 * �����Է��۾� - LottoInputThread
 * ::
 * �ΰ��� �����尡 Process�ȿ��� ���� ���ҽ��� �����ϸ鼭 ���� ��Ȳ�� �������� �ۼ�
 * ī���õǴ� ��Ȳ�� ���� �����ϵ��� ������ �ۼ�
 * ::
 * 1. ī��Ʈ�� �� �������� �����Է��� �ȵǸ� : �ش� ���α׷��� ����
 * 2. ī��Ʈ ���൵�߿��� ���ڰ� �ԷµǸ� - ���̻� ī������ �������� �ʵ��� �Ѵ�.
 */

class CountThread implements Runnable { // ī���� �۾�
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
			System.out.println("10�ʰ� ����Ǿ����ϴ�.");
			System.exit(0);
		}
	}
}

class LottoInputThread implements Runnable { // ���� �Է��۾�
	InputThreadTest3 process;

	public LottoInputThread(InputThreadTest3 process) {
		super();
		this.process = process;
	}

	public void run() {
		String input = JOptionPane.showInputDialog("���� �ζ� ��ȣ �������ڸ� ���ڸ� �Է��Ͻÿ�.");
		System.out.println("�Է��� ���� : " + input);

		process.inputCheck = true;
	}
}

public class InputThreadTest3 {
	// �ʵ� :: �����尣 �ڿ� ����
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
