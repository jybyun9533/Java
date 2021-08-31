package com.encore.banking.test;

import java.util.Scanner;

import com.encore.banking.Account;
import com.encore.banking.Customer;

/*
 * 1. Customer ��ü�� ����
 *  -> �̶� �� ������ Scanner��ü�� ���ؼ� �Է� (�̸�, ssn)
 * 2. ���� ������ �����Ѵ�.(�̶� hasing)
 * 3. ���� ������ ������ ��ȯ
 * 4. ������ ���(1���� �Ա�, 5õ�� �Ա�, 2õ�� �Ա�, 7õ�� ���)
 * 5. �������� �ܾ��� �ַܼ� ��� : 1���� + balance(�����ܾ�)
 */

public class BankingTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //��ĳ�� ȣ��
		/*
		 * ��ĳ�ʷ� �̸�, �ֹι�ȣ, �Աݱݾ��� �Է¹޾Ƽ� ���� ������ ����
		 * String name = �̸�
		 * int ssn = �ֹι�ȣ
		 * int money = �Ա��� �ݾ�
		 */
		System.out.println("�̸��� �Է��Ͻÿ�.");
		String name = sc.next(); // �̸��Է�
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��Ͻÿ�.");
		int ssn = sc.nextInt(); // �ֹι�ȣ �Է�
		System.out.println("���� ������ ���� �ݾ��� �Է��Ͻÿ�.");
		int money = sc.nextInt(); // ���尳���� �Ա��� �ݾ�
		
		

		// Customer ��ü ����
		Customer customer = new Customer(name, ssn);
		
		customer.setAccount(new Account(money));;

		Account myAccount =customer.getAccount();
		
		// ��ü�� �� ��� ����
		System.out.println("===�� �����===");
		myAccount.deposit(10000);
		System.out.println("1���� �Ա�");
		myAccount.deposit(300);
		System.out.println("5õ�� �Ա�");
		myAccount.deposit(2000);
		System.out.println("2õ�� �Ա�");
		myAccount.withdraw(70000);
		System.out.println("7õ�� ���");
		System.out.println("===�� ���Ϸ�===");

		System.out.println();

		// �� ��� �� �ܰ�Ȯ��
		System.out.println(customer.getCustInfo());

	}

}
