package com.encore.service;

import com.encore.vo.Product;

/*
 * ProductStore�� �ִ� �پ��h ��ǰ���� �ٷ�� ��ɸ��� ��Ƴ��� Ŭ����
 * �̷� ��ɸ����� �ۼ��� Ŭ������ ����(Manage) Ŭ������� �Ѵ�.
 * 
 * �� Ŭ�������� �ٷ�� ��ɵ�
 * - ��� ��ǰ���� maker�� ���
 * - ��ǰ���� �� ���Ծ��� �����ϴ� ���
 * - Ư�� �ݾ� �̻��� �Ǵ� ��ǰ�� �����ϴ� ���
 * - Ư��ȸ�� ��ǰ���� �����ϴ� ���
 * - ������ ��ǰ�� ��հ��� �����ϴ� ���
 * 
 * --> ����� Identifier �����ϴ� ����� �Բ�
 */
public class ProductStoreService {

	// ��� ��ǰ���� maker ���
	public void printProductMakers(Product[] products) {
		for (Product p : products) {
			System.out.println(p.getMaker());
		}
	}

	// ��ǰ���� �� ���Ծ��� ����
	public int getTotalPrice(Product[] products) {
		int sum = 0;
		for (Product p : products) {
			sum += p.getPrice() * p.getQuantity();
		}
		return sum;
	}

	// Ư�� �ݾ� �̻��� �Ǵ� ��ǰ�� �����ϴ� ���
	public Product[] getMorePrice(Product[] products, int price) {
		Product[] temp = new Product[products.length];
		int idx = 0;

		for (Product p : products) {
			if (p.getPrice() >= price) {
				temp[idx++] = p;
				// temp[idx] = p;
				// idx++;
			}
		}
		return temp;
	}

	// Ư��ȸ�� ��ǰ���� �����ϴ� ���
	public Product[] getCertainCompany(Product[] products, String company) {
		Product[] temp = new Product[products.length];
		int idx = 0;

		for (Product p : products) {
			if (p.getCompany().equals(company))
				temp[idx++] = p;
		}
		return temp;
	}

	// ������ ��ǰ�� ��հ��� �����ϴ� ���
	public int getAvgPrice(Product[] pros) {
		// �� ���� ���ϱ� -> ������ ������ �޼ҵ� ȣ��
		// �� ������ ������ ������.
		return getTotalPrice(pros) / pros.length;
	}

}
