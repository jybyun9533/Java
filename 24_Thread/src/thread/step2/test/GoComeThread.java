package thread.step2.test;

/*
 * Runnable 인터페이스를 구현해서 Thread를 구현 
 */
class GoThread implements Runnable {

	// 쓰레드를 만들면 무조건 run() 만든다.
	public void run() { // 쓰레드가 작동하는 부분
		int i = 0;
		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 현재 실행중인 쓰레드의 이름
			String tName = Thread.currentThread().getName();
			System.out.println(tName + " : " + i++);
			if (i == 20) {
				break;
			}
		}
	}

}

class ComeThread implements Runnable {
	public void run() { // 쓰레드가 작동하는 부분
		int i = 0;
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 현재 실행중인 쓰레드의 이름
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
		// GoComeThread라는 프로세스 안에서 2개의 쓰레드를 동작시킨다.
		GoThread go = new GoThread();
		ComeThread come = new ComeThread();

		Thread t1 = new Thread(go, "GoThread");
		Thread t2 = new Thread(come, "ComeThread");

		t1.start();
		t2.start();

	}

}
