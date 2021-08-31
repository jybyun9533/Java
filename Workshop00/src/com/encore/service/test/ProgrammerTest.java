package com.encore.service.test;

import com.encore.service.NoteBook;
import com.encore.service.Programmer;
import com.encore.service.util.MyDate;

public class ProgrammerTest {

	/*
	 * 1. Programmer 객체생성
	 * 2. Programmer가 Note를 가짐
	 * 3. 개발자 정보와 노트북 정보 출력
	 * 4. 더 필요한 기능?
	 */
	
	public static void main(String[] args) {
		
		Programmer programmer = new Programmer("변준영", new MyDate(95,03,03), "AA", "BB");
		programmer.setNoteBook(new NoteBook(111, "삼성", 100000));
		
		NoteBook myNoteBook = programmer.getNoteBook();
		System.out.println(programmer.getProgrammerInfo());
		System.out.println(myNoteBook.getNoteBookInfo());
		
	
		
				
		

	}

}
