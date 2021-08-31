package com.encore.array;

//통장에 대한 정보를 가지고 있는 Account클래스
public class Account {

	// 1. 필드선언
	private double balance;
	private String bankName;

	// 2. 주입의 통로 (생성자||setter)
	public Account(double balance, String bankName) {
		super();
		this.balance = balance;
		this.bankName = bankName;
	}

	// 3. 필드 정보를 받아오기
	public String getAccount() {
		return balance + ", " + bankName;
	}

	// 4. 나머지 기능
	public void withdraw(double amt) {
		if (balance < amt) {
			System.err.println("잔액이 부족합니다.");
			return;
		}
		balance -= amt;
	}

	public void deposit(double amt) {
		if (1000 > amt) {
			System.err.println("1000원 이상 입금해주세요.");
			return;
		}
		balance += amt;
	}
}
