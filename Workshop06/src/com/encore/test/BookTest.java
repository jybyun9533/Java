package com.encore.test;

import com.encore.manager.BookManager;
import com.encore.vo.Book;
import com.encore.vo.Magazine;

public class BookTest {

	public static void main(String[] args) {
		BookManager manager = BookManager.getInstance();

		Book b1 = new Book("1", "aa", "bb", "cc", 100, "dd");
		Book b2 = new Book("2", "aa2", "bb2", "cc2", 200, "dd2");
		Book b3 = new Magazine("3", "aa3", "bb3", "cc3", 300, "dd3", 1995, 3);
	
		Book[] book = {b1, b2, b3};
		
		System.out.println(manager.getNumberOfBooks());
		manager.insertBook(b1);
		System.out.println(manager.getNumberOfBooks());
		manager.insertBook(b2);
		System.out.println(manager.getNumberOfBooks());
		
		for(Book b : manager.getAllBook()) {
			if(b==null) {
				break;
			}
			System.out.println(b);	
		}
		
		System.out.println(manager.getSumPriceOfBooks());
		System.out.println(manager.getAveragePriceOfBooks());
		
		
		System.out.println(manager.searchBookByIsbn("1"));
		
		for(Book b : manager.searchBookByPublisher("bb")) {
			if(b==null) {
				break;
			}
			System.out.println(b);	
		}
		
	}

}
