package com.encore.datatype.test;

import com.encore.datatype.WhiteBoard;

public class WhiteBoardTest1 {

	public static void main(String[] args) {

		WhiteBoard wb = new WhiteBoard();
		wb.setField(100, 'R', 20.0f, "Byun", "leather", true); // float�� float���� �˷��ֱ����� �ڿ� f�� ���δ�.
		wb.printInfo();

	}

}
