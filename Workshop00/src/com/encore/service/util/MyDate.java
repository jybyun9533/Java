package com.encore.service.util;

//Programmer의 생년월일의 정보를 담고 있는 클래스
public class MyDate {

	int year, month, day;

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// 필드 값 받아오기
	public String getDate() {
		return String.valueOf(year) + String.valueOf(month) + String.valueOf(day); 
	}

}
