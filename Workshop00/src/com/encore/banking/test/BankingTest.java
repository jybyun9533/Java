package com.encore.banking.test;

import java.util.Scanner;

import com.encore.banking.Account;
import com.encore.banking.Customer;

/*
 * 1. Customer 객체를 생성
 *  -> 이때 고객 정보는 Scanner객체를 통해서 입력 (이름, ssn)
 * 2. 고객이 통장을 개설한다.(이때 hasing)
 * 3. 고객이 개설한 통장을 반환
 * 4. 통장을 사용(1만원 입금, 5천원 입금, 2천원 입금, 7천원 출금)
 * 5. 최종적인 잔액을 콘솔로 출력 : 1만원 + balance(통장잔액)
 */

public class BankingTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //스캐너 호출
		/*
		 * 스캐너로 이름, 주민번호, 입금금액을 입력받아서 각각 변수에 저장
		 * String name = 이름
		 * int ssn = 주민번호
		 * int money = 입금할 금액
		 */
		System.out.println("이름을 입력하시오.");
		String name = sc.next(); // 이름입력
		System.out.println("주민등록번호를 입력하시오.");
		int ssn = sc.nextInt(); // 주민번호 입력
		System.out.println("통장 개설시 넣을 금액을 입력하시오.");
		int money = sc.nextInt(); // 통장개설시 입금할 금액
		
		

		// Customer 객체 생성
		Customer customer = new Customer(name, ssn);
		
		customer.setAccount(new Account(money));;

		Account myAccount =customer.getAccount();
		
		// 객체의 돈 사용 내역
		System.out.println("===돈 사용중===");
		myAccount.deposit(10000);
		System.out.println("1만원 입금");
		myAccount.deposit(300);
		System.out.println("5천원 입금");
		myAccount.deposit(2000);
		System.out.println("2천원 입금");
		myAccount.withdraw(70000);
		System.out.println("7천원 출금");
		System.out.println("===돈 사용완료===");

		System.out.println();

		// 돈 사용 후 잔고확인
		System.out.println(customer.getCustInfo());

	}

}
