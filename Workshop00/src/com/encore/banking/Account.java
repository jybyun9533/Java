package com.encore.banking;

/*
 * 1. �ʵ弱��
 * 2. ���� ������ ��ε��� ��� : setter, ������
 * 3. �ʵ� ���� �޾ƿ´�.
 * 
 * ##########
 * �����ڸ� ���� ���� vs setter�� ���� ����
 * 1) ������
 *  - ��ü�� ������ �� ������ ���� �����ؾ� ��.
 * 2) setter
 *  - ��ü�� �����Ҷ� ���� ���� ���ص� ��.
 */

// ���忡 ���� ������ ���� �ִ� Ŭ����
public class Account {

	//�ʵ� ����
	public double balance;

	// ������
	public Account(double money) {
		this.balance = money;
	}
	
	// Setter�� ����
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// �ܵ���ȯ �޼ҵ�	
	public double getBalance() {
		return balance;
	}


	// �Ա� �޼ҵ�
	public void deposit(double money) {
		if (money<=1000) {
			System.err.println("�����߻�");
			return;
		}
		balance += money; // balance = balance + money 
	}

	// ��� �޼ҵ�
	public void withdraw(double money) {
	
		if (money>balance) {
			System.err.println("�����߻�");
			return;
		}
		balance -= money; // balance = balance - money
	}

}
