package com.encore.vo;

import java.io.Serializable;

/*
 * isbn, title, price, quantity
 * 생성자, getter, setter, string
 */
public class Book implements Serializable{
	// Field
	private String isbn;
	private String title;
	private int price;
	private int quantity;

	// Constructors
	public Book() {
	}

	public Book(String isbn, String title, int price, int quantity) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}

	// Setter & Getter
	// setIsbn은 기본키이기 때문에 구현X
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getIsbn() {
		return isbn;
	}

	// toString
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
