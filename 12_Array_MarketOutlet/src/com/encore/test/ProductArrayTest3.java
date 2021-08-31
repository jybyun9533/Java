package com.encore.test;

import com.encore.service.ProductStoreService;
import com.encore.vo.Product;

public class ProductArrayTest3 {

	public static void main(String[] args) {

		ProductStoreService service = new ProductStoreService();

		Product[] product = { new Product("���Ӹ���Ǫ", 23000, 2, "LG"), new Product("��ټ�����", 2000, 7, "HP"),
				new Product("�Ŷ��", 1200, 10, "SAMSUNG"), new Product("ĹŸ��", 340000, 1, "LG") };

		System.out.println("====1. ��� ��ǰ�� ����Ŀ�� ����մϴ�.====");
		service.printProductMakers(product);

		System.out.println("====2. ��� ��ǰ�� �� ���Ծ��� ����մϴ�.====");
		System.out.println(service.getTotalPrice(product) + "��");

		System.out.println("====3. 1���� �̻��� ���ĵ��� ����մϴ�.====");
		Product[] returnPros = service.getMorePrice(product, 10000);
		for (Product p : returnPros) { // logic�� ������ null�������� �����߻�.
			if (p == null) {
				continue;
			}
			System.out.println(p.getDetail());
		}

		System.out.println("====4. ������ ȸ���� ���ĵ��� ����մϴ�.====");
		Product[] returnPros1 = service.getCertainCompany(product, "LG");
		for (Product p : returnPros) { // logic�� ������ null�������� �����߻�.
			if (p == null) {
				continue;
			}
			System.out.println(p.getDetail());
		}
		
		System.out.println("====5. ���ĵ��� ��հ��� ����մϴ�.====");
		System.out.println(service.getAvgPrice(product)+"�� �Դϴ�");

	} // main

}
