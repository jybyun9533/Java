package com.encore.child;

import com.encore.parent.Book;

public class Novel extends Book {

	private int year;
	private int month;

	public Novel(String isbn, String title, String author, String publisher, double price, String desc, int year,
			int month) {
		super(isbn, title, author, publisher, price, desc);
		this.year = year;
		this.month = month;
	}
	
	@Override
	public String toString() {
		return "Novel [year=" + year + ", month=" + month + "]";
	}
	
	@Override
	public void date() {
		System.out.println("소설 출시일 : " + toString());
		
	}

}
