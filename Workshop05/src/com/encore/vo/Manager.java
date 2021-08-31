package com.encore.vo;

import com.encore.util.MyDate;

public class Manager {
	private String name, dept;
	private MyDate birthDate;
	private double salary;
	private int deptno;

	public Manager(String name, MyDate birthDate, double salary, String dept, int deptno) {
		super();
		this.name = name;
		this.dept = dept;
		this.birthDate = birthDate;
		this.salary = salary;
		this.deptno = deptno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
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

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	public String getDetails() {
		return "Manager [name=" + name + ", dept=" + dept + ", birthDate=" + birthDate + ", salary=" + salary
				+ ", deptno=" + deptno + "]";
	}
	

}
