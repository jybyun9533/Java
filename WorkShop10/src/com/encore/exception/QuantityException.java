package com.encore.exception;

public class QuantityException extends Exception {
	public QuantityException() {
		this("QuantitiyException :: �ش� ������ ��� �����ϴ�.");
	}

	public QuantityException(String message) {
		super(message);
	}
}
