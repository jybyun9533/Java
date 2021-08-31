package com.encore.manager.Impl;

import com.encore.manager.BookManager;
import com.encore.parent.Book;

public class BookManagerImpl implements BookManager{
	// Field
	private int numberOfBooks = 0;
	private int idx = 0;

	private Book[] book = new Book[100];

	// #### Singletone ���� ####
	static private BookManagerImpl manager = new BookManagerImpl();

	private BookManagerImpl() {
	}

	public static BookManagerImpl getInstance() {
		return manager;
	}

	// ####�޼ҵ� ����####

	// �޼ҵ�1
	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	// �޼ҵ�2
	public void insertBook(Book book) {
		this.book[idx++] = book;
		numberOfBooks++;
	}

	// �޼ҵ�3
	public Book[] getAllBook() {
		return this.book;
	}

	// �޼ҵ�4
	public Book searchBookByIsbn(String str) {
		Book temp = null;
		for (Book b : this.book) {
			if (b.getIsbn().equals(str)) {
				temp = b;
			}
		}
		return temp;
	}

	public Book[] searchBookByTitle(String str) {
		Book[] temp = new Book[numberOfBooks];
		int tempIdx = 0;
		for (Book b : this.book) {
			if (b.getTitle().equals(str)) {
				temp[tempIdx++] = b;
			}
		}
		return temp;
	}

	public Book[] searchBookByPublisher(String str) {
		Book[] temp = new Book[numberOfBooks];
		int tempIdx = 0;
		for (Book b : this.book) {
			if (b.getPublisher().equals(str)) {
				temp[tempIdx++] = b;
			}
		}
		return temp;
	}

	public Book[] searchBookByPrice(double amt) {
		Book[] temp = new Book[numberOfBooks];
		int tempIdx = 0;
		for (Book b : this.book) {
			if (b.getPrice() == amt) {
				temp[tempIdx++] = b;
			}
		}
		return temp;
	}

	public double getSumPriceOfBooks() {
		double sum = 0;

		for (int i = 0; i < numberOfBooks; i++) {
			sum += this.book[i].getPrice();
		}

		return sum;
	}

	public double getAveragePriceOfBooks() {
		double sum = getSumPriceOfBooks();

		return sum / numberOfBooks;
	}

}
