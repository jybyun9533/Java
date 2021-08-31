package poly.service;

import poly.vo.Employee;
import poly.vo.Engineer;
import poly.vo.Manager;

public class EmployeeService {

	// 부서 변경 ->해당인원 고르기 X
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

	// 1번 메소드
	public Employee getEmployee(Employee em) {
		return em;
	}

	// 2번 메소드
	public Employee[] getAllEmployee(Employee[] emps) {
		return emps;
	}

	// 3번 메소드 -> 없을경우 어떻게할지?
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

	// 4번 메소드
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

	// 5번 메소드
	public int getAnnualSalary(Employee em) {
		if (em instanceof Engineer) {
			return (((Engineer) em).getBonus() + em.getSalary() * 12);
		} else
			return em.getSalary() * 12;
	}

	// 6번 메소드
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
