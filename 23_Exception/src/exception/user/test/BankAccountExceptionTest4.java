package exception.user.test;

class AmountInputException extends Exception {
	AmountInputException() {
		this("10000�� �̻� �Ա����ּ���.");
	}

	AmountInputException(String msg) {
		super(msg);
	}
}

class InvalidAmountException extends Exception {
	InvalidAmountException() {
		this("�ܾ��� �����մϴ�.");
	}

	InvalidAmountException(String msg) {
		super(msg);
	}
}

class Account {
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amt) throws AmountInputException {

		if (amt < 10000) {
			throw new AmountInputException();
		} else {
			balance += amt;
			System.out.println("�Ա��� �ݾ� : " + amt + ", ���� �ܾ� : " + balance);
		}
		// �Ա��ϴ� ����
		// �Աݾ��� 10000���� �ȵǸ� AmountInputException�߻�
		// �������� �Ա��̸� �ܾ׿� �ݾ��� �߰��ϰ� �� �ԱݵǾ��� �ܾ��� ������ ���
	}

	public void withdraw(int amt) throws InvalidAmountException {

		if (amt > balance) {
			throw new InvalidAmountException();
		} else {
			balance -= amt;
			System.out.println("����� �ݾ� : " + amt + ", ���� �ܾ� : " + balance);
		}
		// ����ϴ� ����
		// ���� �ܾ׺��� �� ���� �ݾ��� ����Ϸ��� ��� InvalidAmountException �߻�
		// ��ݾ��� �ܾ׺��� �۰ų� ���ٸ� �ܾ�-��ݾ� ��, ������ߴ����� �ܾ��� ���
	}
}

public class BankAccountExceptionTest4 {

	public static void main(String[] args) {
		// ��ü����
		// �޼ҵ� ����ȣ��, ���ܸ� ���⼭ ����
		Account acc = new Account(1000);

		int depositAmt = 1000, withdrawAmt = 11000;
		
		try {
			acc.deposit(depositAmt);
		} catch (AmountInputException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			acc.withdraw(withdrawAmt);
		}catch (InvalidAmountException e) {
			System.out.println(e.getMessage());
		}

	}

}
