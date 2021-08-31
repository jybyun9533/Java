package thread.step1.test;

/*
 * Thread 클래스를 상속받아서 Thread를 만든다.
 * Thread는 2개 생성
 * GoThread, ComeThread
 */
class GoThread extends Thread {
	// 쓰레드를 만들면 무조건 run() 만든다.
	public void run() { // 쓰레드가 작동하는 부분
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
	public void run() { // 쓰레드가 작동하는 부분
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
		//GoComeThread라는 프로세스 안에서 2개의 쓰레드를 동작시킨다.
		GoThread t1 = new GoThread();
		ComeThread t2 = new ComeThread();
		
		t1.start();
		t2.start();
		
	}

}
