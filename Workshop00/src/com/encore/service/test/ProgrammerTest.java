package com.encore.service.test;

import com.encore.service.NoteBook;
import com.encore.service.Programmer;
import com.encore.service.util.MyDate;

public class ProgrammerTest {

	/*
	 * 1. Programmer ��ü����
	 * 2. Programmer�� Note�� ����
	 * 3. ������ ������ ��Ʈ�� ���� ���
	 * 4. �� �ʿ��� ���?
	 */
	
	public static void main(String[] args) {
		
		Programmer programmer = new Programmer("���ؿ�", new MyDate(95,03,03), "AA", "BB");
		programmer.setNoteBook(new NoteBook(111, "�Ｚ", 100000));
		
		NoteBook myNoteBook = programmer.getNoteBook();
		System.out.println(programmer.getProgrammerInfo());
		System.out.println(myNoteBook.getNoteBookInfo());
		
	
		
				
		

	}

}
