package com.encore.banking;

//���� ���� ������ ���� �ִ� Ŭ����
public class Customer {
	// �ʵ弱��
	public String name;
	public int ssn;
	public Account account; // Ŭ������ �����Ҷ� Ŭ������ �����̸�����.(�ҹ���)

	// ������ ����
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

	// ��������� �޼ҵ�
	public String getCustInfo() {
		return "�̸� : " + name + ", �ֹε�Ϲ�ȣ : " + ssn + ", �����ܾ� : " + getAccount().getBalance();
	}

}
