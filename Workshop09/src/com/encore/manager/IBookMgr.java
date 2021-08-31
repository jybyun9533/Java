package com.encore.manager;

import java.util.List;

import com.encore.exception.ISBNNotFoundException;
import com.encore.exception.QuantityException;
import com.encore.vo.Book;

public interface IBookMgr {
	// 도서 최초 입력 기능
	void add(Book book);

	// 전체도서 정보출력 기능
	List<Book> search();

	// 도서가 판매되어 재고 수량을 빼는 기능
	void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException;

	// 도서가 구매되어 재고 수량을 더하는 기능
	void buy(String isbn, int quantity) throws ISBNNotFoundException;

	// 재고 도서들의 (수량*금액)을 하여 총 재고 금액을 구하여 리턴
	int getTotalAmount();
	
	// 클래스 생성시에 호출되며, 파일("book.dat")에 저장된 파일을 읽어서 ArrayList에 저장
	void open();
	
	// 프로그램 종료시에 호출되며, ArrayList에 있는 도서 정보를 파일로 저장
	void close();

}
