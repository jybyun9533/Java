package com.encore.service;

public class NoteBook {
	
	// �ʵ弱��
	public int serialNum;
	public String brand;
	public int price;
	
	// ������
	public NoteBook(int serialNum, String brand, int price) {
		super();
		this.serialNum = serialNum;
		this.brand = brand;
		this.price = price;
	}
	
	//��Ʈ�� ���� ��ȯ
	public String getNoteBookInfo() {
		return "�Ϸù�ȣ : " + serialNum + ", ������ : " + brand + ", ���� : " + price;
	}
	
	

}
