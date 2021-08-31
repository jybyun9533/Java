package com.encore.service.impl;

import java.util.ArrayList;

import com.encore.service.EmployeeListService;
import com.encore.vo.Employee;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

/*
 * 1. �������̽��� ��ӹ޾Ƽ� ����
 * 2. �̱���
 */
public class EmployeeListServiceImpl implements EmployeeListService {

	private ArrayList<Employee> list;

	// �̱��� ����
	private static EmployeeListServiceImpl service = new EmployeeListServiceImpl();

	private EmployeeListServiceImpl() {
		list = new ArrayList<Employee>();
	}

	public static EmployeeListServiceImpl getInstance() {
		return service;
	}

	// �������̽� ����
	@Override
	public void addEmployee(Employee e) {
		boolean find = false; // flag�� �ϳ� ����
		for (Employee em : list) {
			if (em.getEmpId().equals(e.getEmpId())) {
				find = true;
				System.err.println("�̹� �ִ� ID�Դϴ�.");
				return;
			}
		}

		if (find == false) {
			list.add(e);
			System.out.println(e.getName()+"�� ȸ������ ���ԵǼ̽��ϴ�.");
		}

	}

	@Override
	public void deleteEmployee(String empId) {
		boolean find = false;
		for (Employee em : list) {
			if (em.getEmpId().equals(empId)) {
				find = true;
				System.out.println(em.getName()+"���� �����մϴ�");
				list.remove(em);
				break;
			}
		}
		if(find==false) {
			System.out.println("�����Ϸ��� ����� ���� ȸ���߿��� �������� �ʽ��ϴ�.");
		}
 
	}

	@Override
	public void updateEmployee(Employee e) {
		boolean find =false;
		for(Employee emp : list) {
			if(e.getEmpId().equals(emp.getEmpId())) {
				emp.setName(e.getName());
				emp.setAddr(e.getAddr());
				emp.setSalary(e.getSalary());
				
				if(emp instanceof Manager) {
					((Manager)emp).changeDept(((Manager)e).getDept());
				}
				if (emp instanceof Engineer) {
					((Engineer)emp).changeTech(((Engineer)e).getTech());
					((Engineer)emp).changeBonus(((Engineer)e).getBonus());
				}
			}
			
		
		}
	}

	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		for (Employee em : list) {
			if (em.getAddr().equals(addr)) {
				temp.add(em);
			}
		}
		return temp;
	}

	@Override
	public void findEmployees() {
		
	}

}
