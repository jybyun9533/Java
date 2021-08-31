package com.encore.banking;

//고객에 관한 정보를 갖고 있는 클래스
public class Customer {
	// 필드선언
	public String name;
	public int ssn;
	public Account account; // 클래스를 선언할때 클래스와 같은이름으로.(소문자)

	// 생성자 구현
	public Customer(String name, int ssn/*, Account myAccount*/) {
		this.name = name;
		this.ssn = ssn;
		// this.myAccount = myAccount;
	}

	// Setter & Getter
	public void setAccount(Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	// 고객정보출력 메소드
	public String getCustInfo() {
		return "이름 : " + name + ", 주민등록번호 : " + ssn + ", 계좌잔액 : " + getAccount().getBalance();
	}

}
