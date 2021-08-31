package com.encore.array;

public class Customer {
	// 1. �ʵ弱��
	private String name;
	private int ssn;

	// 2. ���� ��� ������
	public Customer(String name, int ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}

	// 3. �ʵ� ���� �޾ƿ�
	public String getCustomer() {
		return name + ", " + ssn;
	}

	// �ʵ� �߰�... �������� ������ ������ ���� �ǵ���
	private Account[] accounts;

	// ��� �߰�... �߰��� �ʵ带 setter�� ����
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	
	// ����߰�... �߰��� �ʵ带 �޾ƿ��� ���
	public Account[] getAccounts() {
		return accounts;
	}
}
