package com.encore.service;

import com.encore.service.util.MyDate;

public class Programmer {

	// 필드 생성
	public String name;
	public MyDate birthDate;
	public String company;
	public String tech;

	public NoteBook noteBook;

	// 생성자
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

	// 프로그래머 정보반환 메소드
	public String getProgrammerInfo() {
		return "이름 : " + name + "(" + birthDate.getDate() + "), 회사 : " + company + ", tech : " + tech;
	}

}
