package com.encore.array.test;

import com.encore.array.Account;

public class AccountArrayTest1 {

	public static void main(String[] args) {
		// 1. Account Type�� �迭�� ����, ������� 3
		Account[] account = new Account[3];

		// 2. ������ ĭ�� ����, ����, �츮���� ������ ����
		account[0] = new Account(10000, "����");
		account[1] = new Account(20000, "����");
		account[2] = new Account(30000, "�츮");

		// 3. For���� ����ؼ� ������ Account ���� ���
		for (int i = 0; i < account.length; i++) {
			System.out.println(account[i].getAccount());
		}

	}

}
