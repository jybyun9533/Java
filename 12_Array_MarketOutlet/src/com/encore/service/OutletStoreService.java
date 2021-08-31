package com.encore.service;

import com.encore.vo.Customer;
import com.encore.vo.Product;

/*
 * ��ǰ�� �����ϴ� ��, ������ ������ ��ǰ������ �ٷ�� ����� ��Ƴ��� ���� Ŭ����
 */

public class OutletStoreService {
	// 1. Ư�� ���� ������ ��ǰ������ ����
	public Product[] getProduct(Customer vo) {
		return vo.getProducts();
	}

	// 2. Ư�� ���� ������ ��ǰ�� maker�鸸 ����
	public String[] getAllProductMaker(Customer vo) {
		String[] temp = new String[vo.getProducts().length];
		Product[] pros = vo.getProducts();
		int cnt = 0;
		for (Product p : pros) {
			temp[cnt++] = p.getMaker();
		}
		return temp;
	}

	// 3. Outlet�� �ִ� ��� ���� ����
	public Customer[] getAllCustomer(Customer[] custs) {
		Customer[] temp = new Customer[custs.length];
		int cnt = 0;
		for (Customer c : custs) {
			temp[cnt++] = c;
		}
		return temp;
	}

	// 4. ��� ���߿� Ư�� ���� �˻��ؼ�(ã�Ƽ�) ����
	public Customer getCustomer(Customer[] custs, int ssn) {
		Customer customer = null;
		for (Customer c : custs) {
			if (c.getSsn() == ssn) {
				customer = c;
			}
		}
		return customer;
	}

	// 5. Ư�� ���� ������ ������ �ְ��� �ش��ϴ� ������ ������ ����
	public int maxPriceProduct(Customer c) {
		int maxPrice = 0;
		Product[] pros = c.getProducts();
		for (Product p : Pros) {
			if (p.getPrice() > maxPrice) {
				maxPrice = p.getPrice();
			}
		}
		return maxPrice;
	}

	// 6. ��� ���� ������ ������ Ư������ �̻�Ǵ� ��ǰ�� ����
	public Product[] getMorePriceProducts(Customer[] custs, int price) {
		int len = 0, cnt = 0;
		for (Customer c : custs) {
			len += c.getProducts().length;
		}
		Product[] temp = new Product[len];

		for (Customer c : custs) {
			for (Product p : c.getProducts()) {
				if (p.getPrice() > price) {
					temp[cnt++] = p;
				}
			}
		}
		return temp;
	}

	// 7. ������ ���׿� ����ִ� ���鸸 ����
	public Customer[] getsSameAddressCustomer(Customer[] customers, String city) {
		Customer[] temp = new Customer[customers.length];
		int idx = 0;

		for (Customer c : customers) {
			if (c.getAddress().equals(city)) {
				temp[idx++] = c;
			}
		}
		return temp;
	}

}
