package poly.service;

import poly.vo.Employee;
import poly.vo.Engineer;
import poly.vo.Manager;

public class EmployeeService {

	// �μ� ���� ->�ش��ο� ���� X
//	public void changeEmployee(Employee em, String str) {
//		if (em instanceof Manager) {
//			((Manager) em).changeDept(str);
//		} else if (em instanceof Engineer) {
//			((Engineer) em).changeTech(str);
//		}
//	}

	static private EmployeeService service = new EmployeeService();

	private EmployeeService() {
	}

	public static EmployeeService getInstance() {
		return service;
	}

	// 1�� �޼ҵ�
	public Employee getEmployee(Employee em) {
		return em;
	}

	// 2�� �޼ҵ�
	public Employee[] getAllEmployee(Employee[] emps) {
		return emps;
	}

	// 3�� �޼ҵ� -> ������� �������?
	public Employee findByEmpId(Employee[] emps, String empId) {
		Employee emp = null;

		for (Employee e : emps) {
			if (e.getEmpId().equals(empId)) {
				emp = e;
				break;
			}
		}
		return emp;
	}

	// 4�� �޼ҵ�
	public Employee[] findByAddress(Employee[] emps, String addr) {
		Employee[] temp = new Employee[emps.length];
		int idx = 0;
		for (Employee e : emps) {
			if (e.getEmpId().equals(addr)) {
				temp[idx++] = e;
			}
		}
		return temp;
	}

	// 5�� �޼ҵ�
	public int getAnnualSalary(Employee em) {
		if (em instanceof Engineer) {
			return (((Engineer) em).getBonus() + em.getSalary() * 12);
		} else
			return em.getSalary() * 12;
	}

	// 6�� �޼ҵ�
	public int getTotalCost(Employee[] emps) {
		int total = 0;

		for (Employee e : emps) {
			if (e instanceof Engineer) {
				total += (((Engineer) e).getBonus() + e.getSalary() * 12);
			} else
				total += e.getSalary() * 12;
		}
		return total;
	}

}// class
