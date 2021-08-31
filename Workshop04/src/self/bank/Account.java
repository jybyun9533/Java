package self.bank;

public class Account {

	private int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public String getBalance() {
		return "���� �ܾ��� " + balance + "�� �Դϴ�.";
	}

	public void deposit(int amt) {
		if (1000 > amt) {
			System.err.println("1000�� �̻� �Ա����ּ���.");
			return;
		}
		balance += amt;
	}

	public void withdraw(int amt) {
		if (balance < amt) {
			System.err.println("�ܾ��� �����մϴ�.");
			return;
		}
		balance -= amt;
	}

	@Override
	public String toString() {
		return "���� �ܾ��� " + balance + "�� �Դϴ�.";
	}

}
