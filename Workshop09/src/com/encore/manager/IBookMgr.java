package com.encore.manager;

import java.util.List;

import com.encore.exception.ISBNNotFoundException;
import com.encore.exception.QuantityException;
import com.encore.vo.Book;

public interface IBookMgr {
	// ���� ���� �Է� ���
	void add(Book book);

	// ��ü���� ������� ���
	List<Book> search();

	// ������ �ǸŵǾ� ��� ������ ���� ���
	void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException;

	// ������ ���ŵǾ� ��� ������ ���ϴ� ���
	void buy(String isbn, int quantity) throws ISBNNotFoundException;

	// ��� �������� (����*�ݾ�)�� �Ͽ� �� ��� �ݾ��� ���Ͽ� ����
	int getTotalAmount();
	
	// Ŭ���� �����ÿ� ȣ��Ǹ�, ����("book.dat")�� ����� ������ �о ArrayList�� ����
	void open();
	
	// ���α׷� ����ÿ� ȣ��Ǹ�, ArrayList�� �ִ� ���� ������ ���Ϸ� ����
	void close();

}
