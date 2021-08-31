package thread.step6.test;

public class MegaBoxProcess {

	public static void main(String[] args) {
		MegaBoxUser user = new MegaBoxUser();
		Thread th1 = new Thread(user, "¿øºó");
		Thread th2 = new Thread(user, "ÀÌ³ª¿µ");
		
		th1.start();
		th2.start();

	}

}
