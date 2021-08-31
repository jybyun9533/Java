package com.encore.exception;

public class QuantityException extends Exception {
	public QuantityException() {
		this("QuantitiyException :: 해당 도서의 재고가 없습니다.");
	}

	public QuantityException(String message) {
		super(message);
	}
}
