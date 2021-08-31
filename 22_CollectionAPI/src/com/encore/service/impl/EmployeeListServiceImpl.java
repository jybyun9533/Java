package com.encore.service.impl;

import java.util.ArrayList;

import com.encore.service.EmployeeListService;
import com.encore.vo.Employee;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

/*
 * 1. 인터페이스를 상속받아서 정의
 * 2. 싱글톤
 */
public class EmployeeListServiceImpl implements EmployeeListService {

	private ArrayList<Employee> list;

	// 싱글톤 패턴
	private static EmployeeListServiceImpl service = new EmployeeListServiceImpl();

	private EmployeeListServiceImpl() {
		list = new ArrayList<Employee>();
	}

	public static EmployeeListServiceImpl getInstance() {
		return service;
	}

	// 인터페이스 구현
	@Override
	public void addEmployee(Employee e) {
		boolean find = false; // flag값 하나 선언
		for (Employee em : list) {
			if (em.getEmpId().equals(e.getEmpId())) {
				find = true;
				System.err.println("이미 있는 ID입니다.");
				return;
			}
		}

		if (find == false) {
			list.add(e);
			System.out.println(e.getName()+"님 회원으로 가입되셨습니다.");
		}

	}

	@Override
	public void deleteEmployee(String empId) {
		boolean find = false;
		for (Employee em : list) {
			if (em.getEmpId().equals(empId)) {
				find = true;
				System.out.println(em.getName()+"님을 삭제합니다");
				list.remove(em);
				break;
			}
		}
		if(find==false) {
			System.out.println("삭제하려는 대상이 현재 회원중에는 존재하지 않습니다.");
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
