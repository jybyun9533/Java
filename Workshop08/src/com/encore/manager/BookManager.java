package com.encore.manager;

import java.util.ArrayList;

import com.encore.vo.Book;

public interface BookManager {

	void addBook(Book book);

	ArrayList<Book> getAllBook();

	Book searchBookByIsbn(String str);

	ArrayList<Book> searchBookByTitle(String str);

	ArrayList<Book> onlySearchBook();

	ArrayList<Book> onlySearchMagazin();

	ArrayList<Book> magazineOfThisYearInfo(int year);

	ArrayList<Book> searchBookByPublish(String publisher);

	ArrayList<Book> searchBookByPrice(int price);
	
	int getTotalPrice();
	
	int getAvgPrice();
}
