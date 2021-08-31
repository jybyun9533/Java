package com.encore.test;

import com.encore.vo.Product;

public class ProductArrayTest1 {

	public static void main(String[] args) {

		Product[] product = { new Product("���Ӹ���Ǫ", 23000, 2, "LG"), 
				new Product("��ټ�����", 2000, 7, "HP"),
				new Product("�Ŷ��", 1200, 10, "SAMSUNG"),
				new Product("ĹŸ��", 340000, 1, "LG") 
				};

		// ��ǰ�� ����Ŀ ���
		System.out.println("====��ǰ���� ����Ŀ�� ����մϴ�.====");
		for (Product p : product) {
			System.out.println(p.getMaker());
		}

		// Ư������ �̻� ��ǰ ���
		System.out.println("====10���� �̻��ϴ� ��ǰ���� ����մϴ�.====");
		for (Product p : product) {
			if (p.getPrice() >= 100000)
				System.out.println(p.getDetail());
		}

		// ������ ���ǵ��� �Ѱ���

		System.out.println("====�� ���԰����� ����մϴ�.====");
		int total = 0;
		for (Product p : product) {
			total += p.getPrice() * p.getQuantity();
		}
		System.out.println("Total Price : " + total + "��");

	} // main

}
