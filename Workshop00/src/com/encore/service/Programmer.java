package com.encore.service;

import com.encore.service.util.MyDate;

public class Programmer {

	// �ʵ� ����
	public String name;
	public MyDate birthDate;
	public String company;
	public String tech;

	public NoteBook noteBook;

	// ������
	public Programmer(String name, MyDate birthDate, String company, String tech) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.company = company;
		this.tech = tech;
	}

	// setter&getter
	public void setNoteBook(NoteBook noteBook) {
		this.noteBook = noteBook;
	}

	public NoteBook getNoteBook() {
		return noteBook;
	}

	// ���α׷��� ������ȯ �޼ҵ�
	public String getProgrammerInfo() {
		return "�̸� : " + name + "(" + birthDate.getDate() + "), ȸ�� : " + company + ", tech : " + tech;
	}

}
