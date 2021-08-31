package com.encore.manager.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.encore.exception.ISBNNotFoundException;
import com.encore.exception.QuantityException;
import com.encore.manager.IBookMgr;
import com.encore.vo.Book;

public class BookMgrImpl implements IBookMgr {

	// 도서 ArrayList
	private ArrayList<Book> books;
	File file;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	FileOutputStream fos;
	FileInputStream fis;

	// 싱글톤 구현
	private static BookMgrImpl manager = new BookMgrImpl();

	private BookMgrImpl() {
		books = new ArrayList<Book>();
		file = new File("book.dat");
		if (file.exists()) {
			open();
		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static BookMgrImpl getInstance() {
		return manager;
	}

	// 기능구현

	@Override
	public void add(Book book) {
		boolean flag = false;

		for (Book b : books) {
			if (b.getIsbn().equals(book.getIsbn())) {
				flag = true;
				b.setQuantity(b.getQuantity() + book.getQuantity());
			}
		}
		if (!flag) {
			books.add(book);
		}
		System.out.println("도서 추가 완료.");

	}

	@Override
	public List<Book> search() {
		return books;
	}

	@Override
	public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException {

		boolean isbnFlag = false;

		for (Book b : books) {
			if (b.getIsbn().equals(isbn)) {
				if (quantity > b.getQuantity()) {
					throw new QuantityException();

				} else {
					isbnFlag = true;
					b.setQuantity(b.getQuantity() - quantity);
				}
			} // if
		} // for

		if (!isbnFlag) {
			throw new ISBNNotFoundException();
		}
	}

	@Override
	public void buy(String isbn, int quantity) throws ISBNNotFoundException {
		boolean isbnFlag = false;

		for (Book b : books) {
			if (b.getIsbn().equals(isbn)) {
				isbnFlag = true;
				b.setQuantity(b.getQuantity() + quantity);
			} // if
		} // for
		if (!isbnFlag) {
			throw new ISBNNotFoundException();
		}
	}

	@Override
	public int getTotalAmount() {
		int sum = 0;
		for (Book b : books) {
			sum += (b.getPrice() * b.getQuantity());
		}
		return sum;
	}

	@Override
	public void open() {
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			books = (ArrayList<Book>) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void close() {
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(books);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
