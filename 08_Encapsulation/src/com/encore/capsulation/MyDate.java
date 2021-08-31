package com.encore.capsulation;

public class MyDate {
	// 필드선언
	private int month;
	private int day;

	// getter&setter
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month > 0 && month < 13) {
			this.month = month;
		} else {
			System.err.println("월을 제대로 입력하시오.");
			return;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8
				|| this.month == 10 || this.month == 12) {
			if (day > 0 && day < 32) {
				this.day = day;
			} else
				System.err.println("일을 제대로 입력하시오.");
				return;
		} else if (this.month == 2) {
			if (day > 0 && day < 29) {
				this.day = day;
			} else
				System.err.println("일을 제대로 입력하시오.");
				return;
		} else {
			if (day > 0 && day < 31) {
				this.day = day;
			} else
				System.err.println("일을 제대로 입력하시오.");
				return;
		}

	}

}
