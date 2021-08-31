package com.encore.manager;

import com.encore.parent.Book;


public interface BookManager {

	int getNumberOfBooks();

	void insertBook(Book book);

	Book[] getAllBook();

	Book searchBookByIsbn(String str);

	Book[] searchBookByTitle(String str);

	Book[] searchBookByPublisher(String str);

	Book[] searchBookByPrice(double amt);

	double getSumPriceOfBooks();
	
	double getAveragePriceOfBooks();

}
