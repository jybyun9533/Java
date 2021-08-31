package com.encore.datatype;

/*
 * 1. �ʵ�
 *  - int ������, char �÷�, float ����, String ����ȸ��, String ����, boolean ��ũ��ġ ����
 * 
 * 2. �޼ҵ�
 *	- ���� Test Class���� �޾Ƽ� �ʵ忡 �Է��ϴ� ���
 *  - �ʵ忡 �Էµ�, ����� ���� �ܼ�â���� ����ϴ� ���
 *  
 *  --------------------
 *  
 * ����(Variable)�� ���Ǵ� ��ġ�� ���� Field�� Local�� ���еǳ�.
 * Field : Ŭ���� ���� �ٷ� ��, �޼ҵ� ��� �ٱ�
 * Local : �޼ҵ� ��
 * 
 */

public class WhiteBoard {
	int size;
	char color;
	float price;
	String manufacturer, meterial;
	boolean scratch;

	public void setField(int size, char color, float price, String manufacturer, String meterial, boolean scratch) {
		// �ʵ�� ���ú����� �̸��� ������, �����ϱ� ���ؼ� �ʵ�տ��� this�� ���δ�.
		// this�� �ش� Ŭ������ ��Ī
		
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
