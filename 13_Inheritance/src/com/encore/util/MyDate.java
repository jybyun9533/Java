package com.encore.util;

public class MyDate {
	private int year, month, day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	@Override
	public String toString() {
		return year +"-"+ month+"-" + day;
	}

}
