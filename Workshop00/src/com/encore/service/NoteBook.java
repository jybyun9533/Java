package com.encore.service;

public class NoteBook {
	
	// 필드선언
	public int serialNum;
	public String brand;
	public int price;
	
	// 생성자
	public NoteBook(int serialNum, String brand, int price) {
		super();
		this.serialNum = serialNum;
		this.brand = brand;
		this.price = price;
	}
	
	//노트북 정보 반환
	public String getNoteBookInfo() {
		return "일련번호 : " + serialNum + ", 제조사 : " + brand + ", 가격 : " + price;
	}
	
	

}
