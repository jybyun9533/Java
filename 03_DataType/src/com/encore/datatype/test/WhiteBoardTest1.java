package com.encore.datatype.test;

import com.encore.datatype.WhiteBoard;

public class WhiteBoardTest1 {

	public static void main(String[] args) {

		WhiteBoard wb = new WhiteBoard();
		wb.setField(100, 'R', 20.0f, "Byun", "leather", true); // float는 float임을 알려주기위해 뒤에 f를 붙인다.
		wb.printInfo();

	}

}
