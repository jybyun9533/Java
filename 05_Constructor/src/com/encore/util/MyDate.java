package com.encore.util;

//Programmer�� ��������� ������ ��� �ִ� Ŭ����
public class MyDate {

	int year, month, day;

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// ���� �ʵ忡 ��� �������� setXXX()
	/*
	 * public void setDate(int year, int month, int day) { // �ʵ� �ʱ�ȭ this.year =
	 * year; this.month = month; this.day = day; }
	 */

	// �ʵ� �� �޾ƿ���
	public String getDate() {
		return year + "-" + month + "-" + day; //String(x) + String -> String���� Convert
	}

}
