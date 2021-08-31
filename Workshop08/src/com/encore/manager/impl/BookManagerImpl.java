package com.encore.manager.impl;

import java.util.ArrayList;

import com.encore.manager.BookManager;
import com.encore.vo.Book;
import com.encore.vo.Magazine;

public class BookManagerImpl implements BookManager {

	private ArrayList<Book> books;

	// #### Singletone ���� ####
	static private BookManagerImpl manager = new BookManagerImpl();

	private BookManagerImpl() {
		books = new ArrayList<Book>();
	}

	public static BookManagerImpl getInstance() {
		return manager;
	}

	// �������̽� �޼ҵ� ����
	@Override
	public void addBook(Book book) {
		boolean flag = false;
		for (Book b : books) {
			if (b.getIsbn().equals(book.getIsbn())) {
				flag = true;
				System.err.println("�̹� �߰��� �� å �Դϴ�.");
				return;
			}
		}
		if (!flag) {
			books.add(book);
			System.out.println("å �߰��� �Ϸ�Ǿ����ϴ�.");
		}

	}

	@Override
	public ArrayList<Book> getAllBook() {
		return books;
	}

	@Override
	public Book searchBookByIsbn(String str) {
		Book temp = null;
		for (Book b : books) {
			if (b.getIsbn().equals(str)) {
				temp = b;
			}
		}
		if (temp == null) {
			System.err.println("ã�� å�� �����ϴ�.");
		}
		return temp;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String str) {
		ArrayList<Book> temp = new ArrayList<Book>();

		for (Book b : books) {
			if (b.getTitle().contains(str)) {
				temp.add(b);
			}
		}
		if (temp.size() == 0) {
			System.err.println("ã�� å�� �����ϴ�.");
		}
		return temp;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> temp = new ArrayList<Book>();
		for (Book b : books) {
			if (b instanceof Book) {
				temp.add(b);
			}
		}
		if (temp.size() == 0) {
			System.err.println("å�� �����ϴ�.");
		}
		return temp;
	}

	@Override
	public ArrayList<Book> onlySearchMagazin() {
		ArrayList<Book> temp = new ArrayList<Book>();
		for (Book b : books) {
			if (b instanceof Magazine) {
				temp.add(b);
			}
		}
		if (temp.size() == 0) {
			System.err.println("������ �����ϴ�.");
		}
		return temp;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> temp = new ArrayList<Book>();
		for (Book b : books) {
			if (b instanceof Magazine) {
				if (((Magazine) b).getYear() == year) {
					temp.add(b);
				}
			}
		}
		if (temp.size() == 0) {
			System.err.println(year + "�⿡ ��õ� ������ �����ϴ�.");
		}
		return temp;
	}

	@Override
	public ArrayList<Book> searchBookByPublish(String publisher) {
		ArrayList<Book> temp = new ArrayList<Book>();

		for (Book b : books) {
			if (b.getPublisher().equals(publisher)) {
				temp.add(b);
			}
		}
		if (temp.size() == 0) {
			System.err.println(publisher + "���� ���ǵ� å�� �����ϴ�.");
		}
		return temp;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> temp = new ArrayList<Book>();

		for (Book b : books) {
			if (b.getPrice() <= price) {
				temp.add(b);
			}
		}
		if (temp.size() == 0) {
			System.err.println(price + "������ ������ å�� �����ϴ�.");
		}
		return temp;
	}

	@Override
	public int getTotalPrice() {
		int totalPrice = 0;
		for (Book b : books) {
			totalPrice += b.getPrice();
		}

		return totalPrice;
	}

	@Override
	public int getAvgPrice() {
		return getTotalPrice() / books.size();
	}

}
