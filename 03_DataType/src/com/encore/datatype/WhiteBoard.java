package com.encore.datatype;

/*
 * 1. 필드
 *  - int 사이즈, char 컬러, float 가격, String 제조회사, String 재질, boolean 스크래치 여부
 * 
 * 2. 메소드
 *	- 값을 Test Class에서 받아서 필드에 입력하는 기능
 *  - 필드에 입력된, 저장된 값을 콘솔창으로 출력하는 기능
 *  
 *  --------------------
 *  
 * 변수(Variable)는 사용되는 위치에 따라서 Field와 Local로 구분되낟.
 * Field : 클래스 선언 바로 밑, 메소드 블락 바깥
 * Local : 메소드 안
 * 
 */

public class WhiteBoard {
	int size;
	char color;
	float price;
	String manufacturer, meterial;
	boolean scratch;

	public void setField(int size, char color, float price, String manufacturer, String meterial, boolean scratch) {
		// 필드와 로컬변수의 이름이 같을때, 구분하기 위해서 필드앞에서 this를 붙인다.
		// this는 해당 클래스를 지칭
		
		this.size = size;
		this.color = color;
		this.price = price;
		this.manufacturer = manufacturer;
		this.meterial = meterial;
		this.scratch = scratch;
	}

	public void printInfo() {
		System.out.println(size + " " + color + " " + price + " " + manufacturer + " " + meterial + " " + scratch);
	}

}
