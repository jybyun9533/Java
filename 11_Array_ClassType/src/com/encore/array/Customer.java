package com.encore.array;

public class Customer {
	// 1. 필드선언
	private String name;
	private int ssn;

	// 2. 주입 통로 생성자
	public Customer(String name, int ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}

	// 3. 필드 정보 받아옴
	public String getCustomer() {
		return name + ", " + ssn;
	}

	// 필드 추가... 여러개의 통장을 가지는 고객이 되도록
	private Account[] accounts;

	// 기능 추가... 추가한 필드를 setter로 주입
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	
	// 기능추가... 추가한 필드를 받아오는 기능
	public Account[] getAccounts() {
		return accounts;
	}
}
