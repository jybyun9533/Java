package com.encore.manager.impl;

import java.util.ArrayList;

import com.encore.manager.BookManager;
import com.encore.vo.Book;
import com.encore.vo.Magazine;

public class BookManagerImpl implements BookManager {

	private ArrayList<Book> books;

	// #### Singletone 구현 ####
	static private BookManagerImpl manager = new BookManagerImpl();

	private BookManagerImpl() {
		books = new ArrayList<Book>();
	}

	public static BookManagerImpl getInstance() {
		return manager;
	}

	// 인터페이스 메소드 구현
	@Override
	public void addBook(Book book) {
		boolean flag = false;
		for (Book b : books) {
			if (b.getIsbn().equals(book.getIsbn())) {
				flag = true;
				System.err.println("이미 추가가 된 책 입니다.");
				return;
			}
		}
		if (!flag) {
			books.add(book);
			System.out.println("책 추가가 완료되었습니다.");
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
			System.err.println("찾는 책이 없습니다.");
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
			System.err.println("찾는 책이 없습니다.");
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
			System.err.println("책은 없습니다.");
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
			System.err.println("잡지는 없습니다.");
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
			System.err.println(year + "년에 출시된 잡지는 없습니다.");
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
			System.err.println(publisher + "에서 출판된 책이 없습니다.");
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
			System.err.println(price + "원보다 이하인 책이 없습니다.");
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
