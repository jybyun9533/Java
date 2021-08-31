package com.encore.banking;

/*
 * 1. 필드선언
 * 2. 값을 주입할 통로들을 고민 : setter, 생성자
 * 3. 필드 값을 받아온다.
 * 
 * ##########
 * 생성자를 통한 주입 vs setter를 통한 주입
 * 1) 생성자
 *  - 객체를 생성할 때 무조건 값을 주입해야 함.
 * 2) setter
 *  - 객체를 생성할때 값을 주입 안해도 됨.
 */

// 통장에 관한 정보를 갖고 있는 클래스
public class Account {

	//필드 선언
	public double balance;

	// 생성자
	public Account(double money) {
		this.balance = money;
	}
	
	// Setter로 구현
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// 잔돈반환 메소드	
	public double getBalance() {
		return balance;
	}


	// 입금 메소드
	public void deposit(double money) {
		if (money<=1000) {
			System.err.println("에러발생");
			return;
		}
		balance += money; // balance = balance + money 
	}

	// 출금 메소드
	public void withdraw(double money) {
	
		if (money>balance) {
			System.err.println("에러발생");
			return;
		}
		balance -= money; // balance = balance - money
	}

}
