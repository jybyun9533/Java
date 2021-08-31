package com.encore.util;

//Programmer의 생년월일의 정보를 담고 있는 클래스
public class MyDate {

	int year, month, day;

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// 값을 필드에 어떻게 주입할지 setXXX()
	/*
	 * public void setDate(int year, int month, int day) { // 필드 초기화 this.year =
	 * year; this.month = month; this.day = day; }
	 */

	// 필드 값 받아오기
	public String getDate() {
		return year + "-" + month + "-" + day; //String(x) + String -> String으로 Convert
	}

}
