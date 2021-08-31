package com.encore.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.encore.service.EmployeeMapService;
import com.encore.vo.Employee;

/*
 * 1. �������̽��� ��ӹ޾Ƽ� ����
 * 2. �̱���
 */
public class EmployeeMapServiceImpl implements EmployeeMapService {

	// private ArrayList<Employee> list;
	private Map<String, Employee> map;

	// �̱��� ����
	private static EmployeeMapServiceImpl service = new EmployeeMapServiceImpl();

	private EmployeeMapServiceImpl() {
		map = new HashMap<String, Employee>();
	}

	public static EmployeeMapServiceImpl getInstance() {
		return service;
	}

	@Override
	public void addEmployee(Employee e) {
		if (map.containsKey(e.getEmpId())) {
			System.out.println(e.getName() + "���� �̹� ��ϵ� �����Դϴ�.");
			return;
		} else {
			map.put(e.getEmpId(), e);
			System.out.println(e.getName() + "�� ��ϵǾ����ϴ�.");
		}

	}

	@Override
	public void deleteEmployee(String empId) {
		if (map.containsKey(empId)) {
			map.remove(empId);
			System.out.println("�����Ǿ����ϴ�.");
		} else {
			System.err.println("�������� �ʴ� ID�Դϴ�.");
			return;
		}

	}

	@Override
	public void updateEmployee(Employee e) {
		if (map.containsKey(e.getEmpId())) {
			map.replace(e.getEmpId(), e);
		} else {
			System.err.println("�������� �ʴ� ID�Դϴ�.");
			return;
		}

	}

	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();

		ArrayList<Employee> temp = new ArrayList<Employee>();
		while (it.hasNext()) {
			String token = it.next();
			if (map.get(token).getAddr().equals(addr)) {
				temp.add(map.get(token));
			}

		}
		return temp;
	}

	@Override
	public ArrayList<Employee> findEmployees() {
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();

		ArrayList<Employee> temp = new ArrayList<Employee>();

		while (it.hasNext()) {
			String token = it.next();
			temp.add(map.get(token));
		}
		return temp;
	}

	// �������̽� ����
}