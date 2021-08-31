package com.encore.vo;

/*
 * 상품에 대한 정보를 가지고 있는 클래스
 * vo : Value Object 약자로서 지금처럼 특정한 정보를 담고 있는 클래스들을 VO 클래스라고 함.
 * 
 */
public class Product {

	// 필드선언
	private String maker;
	private String company;
	private int price;
	private int quantity;

	// 생성자
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

	// 기능 구현
	public String getDetail() {
		return maker + ", " + price + ", " + quantity;
	}
}
