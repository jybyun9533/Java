package com.encore.vo;

import com.encore.util.MyDate;

public class Engineer {
	private String name, tech;
	private MyDate birthDate;
	private double salary, bonus;

	public Engineer(String name, MyDate birthDate, double salary, String tech, double bonus) {
		super();
		this.name = name;
		this.tech = tech;
		this.birthDate = birthDate;
		this.salary = salary;
		this.bonus = bonus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String getDetails() {
		return "Engineer [name=" + name + ", tech=" + tech + ", birthDate=" + birthDate + ", salary=" + salary
				+ ", bonus=" + bonus + "]";
	}

}
