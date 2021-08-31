package com.encore.array;

//���忡 ���� ������ ������ �ִ� AccountŬ����
public class Account {

	// 1. �ʵ弱��
	private double balance;
	private String bankName;

	// 2. ������ ��� (������||setter)
	public Account(double balance, String bankName) {
		super();
		this.balance = balance;
		this.bankName = bankName;
	}

	// 3. �ʵ� ������ �޾ƿ���
	public String getAccount() {
		return balance + ", " + bankName;
	}

	// 4. ������ ���
	public void withdraw(double amt) {
		if (balance < amt) {
			System.err.println("�ܾ��� �����մϴ�.");
			return;
		}
		balance -= amt;
	}

	public void deposit(double amt) {
		if (1000 > amt) {
			System.err.println("1000�� �̻� �Ա����ּ���.");
			return;
		}
		balance += amt;
	}
}
