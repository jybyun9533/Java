package com.encore.array.test;

import com.encore.array.Account;

public class AccountArrayTest1 {

	public static void main(String[] args) {
		// 1. Account Type의 배열을 생성, 사이즈는 3
		Account[] account = new Account[3];

		// 2. 각각의 칸에 신한, 국민, 우리은행 통장을 개설
		account[0] = new Account(10000, "신한");
		account[1] = new Account(20000, "국민");
		account[2] = new Account(30000, "우리");

		// 3. For문을 사용해서 각각의 Account 정보 출력
		for (int i = 0; i < account.length; i++) {
			System.out.println(account[i].getAccount());
		}

	}

}
