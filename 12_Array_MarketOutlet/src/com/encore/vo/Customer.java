package com.encore.vo;

/*
 * ��ǰ�� �����ϴ� ���� ���� ������ ����ִ� vo Ŭ����
 * ---------------------------------------
 * Product[] <---- Customer
 */
public class Customer {
	// �ʵ弱��
	private int ssn;
	private String name;
	private String address;

	private Product[] products;

	// ������
	public Customer(int ssn, String name, String address) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}

	// getter & setter
	public Product[] getProducts() {
		return products;
	}

	public void buyProducts(Product[] products) {
		this.products = products;
	}

	public int getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	// ���
	public String getDetails() {
		return name + ", " + address;
	}

} // class
