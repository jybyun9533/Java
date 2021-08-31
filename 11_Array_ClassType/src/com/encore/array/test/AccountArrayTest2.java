package com.encore.array.test;

import com.encore.array.Account;
import com.encore.array.Customer;

public class AccountArrayTest2 {

	public static void main(String[] args) {
		// Account Type�� �迭 ����, ����, �ʱ�ȭ
		Account[] acc = { new Account(10000, "��������"), new Account(30000, "��������"), new Account(40000, "�츮����") };

		// 1. Customer ��ü�� ����
		Customer customer1 = new Customer("Jamese", 12345);
		// 2. Jamse��� ���� ���� 3���� Hasing
		customer1.setAccounts(acc);

		// 3. James�� ������ ������� �޾ƿ´�
		Account[] returnAcc = customer1.getAccounts();

		// 4. James�� ����� �߿��� �������� ���忡�� 50000���Ա�.
		for (Account a : returnAcc) {
			if (a.getAccount().equals("��������"))
				a.deposit(50000.0);
		}
		// 5. �� ������� �ܰ� Ȯ���Ѵ�.
		for (Account a : returnAcc) {
			System.out.println(a.getAccount());
		}

	}

}
