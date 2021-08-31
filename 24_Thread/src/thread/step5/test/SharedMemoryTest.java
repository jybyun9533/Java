package thread.step5.test;

class Calculator {
	private int memory;

	public int getMemory() {
		return memory;

	}

	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}

class UserA extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		setName("CalculatorUserA");
		this.calculator = calculator;
	}

	public void run() {
		calculator.setMemory(100);
	}
}

class UserB extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		setName("CalculatorUserB");
		this.calculator = calculator;
	}

	public void run() {
		calculator.setMemory(50);
	}
}

public class SharedMemoryTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		UserA th1 = new UserA();
		UserB th2 = new UserB();
		
		th1.setCalculator(calculator);
		th1.start();
		
		th2.setCalculator(calculator);
		th2.start();
	}

}
