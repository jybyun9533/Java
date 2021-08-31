package com.encore.exception;

public class ISBNNotFoundException extends Exception {
	public ISBNNotFoundException() {
		this("ISBNNotFoundException :: 해당 도서를 찾을 수 없습니다.");
	}

	public ISBNNotFoundException(String message) {
		super(message);
	}
}
