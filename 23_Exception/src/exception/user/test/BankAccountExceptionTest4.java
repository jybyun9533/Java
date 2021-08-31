package exception.user.test;

class AmountInputException extends Exception {
	AmountInputException() {
		this("10000원 이상 입금해주세요.");
	}

	AmountInputException(String msg) {
		super(msg);
	}
}

class InvalidAmountException extends Exception {
	InvalidAmountException() {
		this("잔액이 부족합니다.");
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
			System.out.println("입금한 금액 : " + amt + ", 현재 잔액 : " + balance);
		}
		// 입금하는 로직
		// 입금액이 10000원이 안되면 AmountInputException발생
		// 정상적인 입금이면 잔액에 금액을 추가하고 얼마 입금되었고 잔액이 얼마인지 출력
	}

	public void withdraw(int amt) throws InvalidAmountException {

		if (amt > balance) {
			throw new InvalidAmountException();
		} else {
			balance -= amt;
			System.out.println("출금한 금액 : " + amt + ", 현재 잔액 : " + balance);
		}
		// 출금하는 로직
		// 현재 잔액보다 더 많은 금액을 출금하려는 경우 InvalidAmountException 발생
		// 출금액이 잔액보다 작거나 같다면 잔액-출금액 후, 얼마출금했는지와 잔액을 출력
	}
}

public class BankAccountExceptionTest4 {

	public static void main(String[] args) {
		// 객체생성
		// 메소드 각각호출, 예외를 여기서 잡음
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
