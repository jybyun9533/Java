package com.encore.cons;

import com.encore.util.MyDate;

//������ ������ ��� �ִ� Ŭ����
public class Programmer {

	public String name;
	public MyDate birthday;
	public float salary;
	public int bonus;

	/*
	 * public void setProgrammer(String name, MyDate birthday, float salary, int
	 * bonus) { // �ʵ� �ʱ�ȭ this.name = name; this.birthday = birthday; this.salary =
	 * salary; this.bonus = bonus; }
	 */

	/*
	 * ������ �߰� �������� ������ �����ϴ� ����� ����
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

	public float getSalary() { // ����*12 + ���ʽ�
		return salary * 12 + bonus;
	}

	// �ʵ� �� �޾ƿ���
	public String getProgrammer() {
		return name + " " + birthday.getDate() + " " + salary + " " + bonus;
	}
}
