package com.encore.vo;

import java.io.Serializable;

public class Magazine extends Book implements Serializable {
	// Field
	private int month;

	// Constructors
	public Magazine() {
	}

	public Magazine(String isbn, String title, int price, int quantity, int month) {
		super(isbn, title, price, quantity);
		this.month = month;
	}

	// setter & getter
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	// toString
	@Override
	public String toString() {
		return super.toString() + "Magazine [month=" + month + "]";
	}

}
