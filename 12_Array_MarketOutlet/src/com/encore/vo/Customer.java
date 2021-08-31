package com.encore.vo;

/*
 * 상품을 구입하는 고객에 대한 정보를 담고있는 vo 클래스
 * ---------------------------------------
 * Product[] <---- Customer
 */
public class Customer {
	// 필드선언
	private int ssn;
	private String name;
	private String address;

	private Product[] products;

	// 생성자
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

	// 기능
	public String getDetails() {
		return name + ", " + address;
	}

} // class
