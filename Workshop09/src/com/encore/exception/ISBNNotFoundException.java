package com.encore.exception;

public class ISBNNotFoundException extends Exception {
	public ISBNNotFoundException() {
		this("ISBNNotFoundException :: �ش� ������ ã�� �� �����ϴ�.");
	}

	public ISBNNotFoundException(String message) {
		super(message);
	}
}
