package com.encore.child;

import com.encore.parent.Book;

public class Magazine extends Book {
	private int year;
	private int month;

	public Magazine(String isbn, String title, String author, String publisher, double price, String desc, int year,
			int month) {
		super(isbn, title, author, publisher, price, desc);
		this.year = year;
		this.month = month;
	}
	
	@Override
	public String toString() {
		return "Magazine [year=" + year + ", month=" + month + "]";
	}

	@Override
	public void date() {
		System.out.println("잡지 발간일 : " + toString());
	}
	
	

	

}
