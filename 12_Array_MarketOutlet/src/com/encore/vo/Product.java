package com.encore.vo;

/*
 * ��ǰ�� ���� ������ ������ �ִ� Ŭ����
 * vo : Value Object ���ڷμ� ����ó�� Ư���� ������ ��� �ִ� Ŭ�������� VO Ŭ������� ��.
 * 
 */
public class Product {

	// �ʵ弱��
	private String maker;
	private String company;
	private int price;
	private int quantity;

	// ������
	public Product(String maker, int price, int quantity, String company) {
		super();
		this.maker = maker;
		this.price = price;
		this.quantity = quantity;
		this.company = company;
	}

	// Getter&Setter
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// ��� ����
	public String getDetail() {
		return maker + ", " + price + ", " + quantity;
	}
}
