package com.encore.array.test;

import com.encore.array.Account;
import com.encore.array.Customer;

public class AccountArrayTest2 {

	public static void main(String[] args) {
		// Account Type의 배열 선언, 생성, 초기화
		Account[] acc = { new Account(10000, "신한은행"), new Account(30000, "국민은행"), new Account(40000, "우리은행") };

		// 1. Customer 객체를 생성
		Customer customer1 = new Customer("Jamese", 12345);
		// 2. Jamse라는 고객이 통장 3개를 Hasing
		customer1.setAccounts(acc);

		// 3. James가 개설한 통장들을 받아온다
		Account[] returnAcc = customer1.getAccounts();

		// 4. James의 통장들 중에서 신한은행 통장에만 50000원입금.
		for (Account a : returnAcc) {
			if (a.getAccount().equals("신한은행"))
				a.deposit(50000.0);
		}
		// 5. 각 통장들의 잔고를 확인한다.
		for (Account a : returnAcc) {
			System.out.println(a.getAccount());
		}

	}

}
