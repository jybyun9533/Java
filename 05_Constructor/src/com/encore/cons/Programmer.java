package com.encore.cons;

import com.encore.util.MyDate;

//개발자 정보를 담고 있는 클래스
public class Programmer {

	public String name;
	public MyDate birthday;
	public float salary;
	public int bonus;

	/*
	 * public void setProgrammer(String name, MyDate birthday, float salary, int
	 * bonus) { // 필드 초기화 this.name = name; this.birthday = birthday; this.salary =
	 * salary; this.bonus = bonus; }
	 */

	/*
	 * 생성자 추가 개발자의 연봉을 리턴하는 기능을 정의
	 */

	public Programmer(String name, MyDate birthday, float salary, int bonus) {
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
		this.bonus = bonus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() { // 월급*12 + 보너스
		return salary * 12 + bonus;
	}

	// 필드 값 받아오기
	public String getProgrammer() {
		return name + " " + birthday.getDate() + " " + salary + " " + bonus;
	}
}
