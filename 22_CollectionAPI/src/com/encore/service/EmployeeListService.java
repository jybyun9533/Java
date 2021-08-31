package com.encore.service;

import java.util.ArrayList;

import com.encore.vo.Employee;

//����� Template�� ��Ƴ��� �������̽�

public interface EmployeeListService {
	
	void addEmployee(Employee e); // public abstract ����

	void deleteEmployee(String empId);

	void updateEmployee(Employee e);

	//Method overloading
	ArrayList<Employee> findEmployees(String addr);
	void findEmployees();

}
