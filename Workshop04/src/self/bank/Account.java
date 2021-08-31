package self.bank;

public class Account {

	private int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public String getBalance() {
		return "현재 잔액은 " + balance + "원 입니다.";
	}

	public void deposit(int amt) {
		if (1000 > amt) {
			System.err.println("1000원 이상 입금해주세요.");
			return;
		}
		balance += amt;
	}

	public void withdraw(int amt) {
		if (balance < amt) {
			System.err.println("잔액이 부족합니다.");
			return;
		}
		balance -= amt;
	}

	@Override
	public String toString() {
		return "현재 잔액은 " + balance + "원 입니다.";
	}

}
