package com.encore.service.util;

//Programmer�� ��������� ������ ��� �ִ� Ŭ����
public class MyDate {

	int year, month, day;

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// �ʵ� �� �޾ƿ���
	public String getDate() {
		return String.valueOf(year) + String.valueOf(month) + String.valueOf(day); 
	}

}
