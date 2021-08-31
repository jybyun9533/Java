package thread.step6.test;

/*
 * MegaBox에서 좌석을 예매하는 일을 전담하는 Thread Class
 * reserve() 라는 기능을 구현
 *  
 */

public class MegaBoxUser implements Runnable {
	private boolean seat = false; // 좌석자리

	@Override
	public void run() {
		// 좌석을 예매하는 기능
		try {
			reserve();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}// run

	public synchronized void reserve() throws InterruptedException {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + "님, 예매를 시작합니다.");

		if (!seat) { //예약 가능
			Thread.sleep(1000);
			System.out.println(tName + "님, 예매를 성공하였습니다.");
			seat = true;
		} else { // 예약 불가능
			System.out.println(tName + "님, 해당 좌석은 예매가 완료된 좌석입니다.");
		}

	}
}// class
