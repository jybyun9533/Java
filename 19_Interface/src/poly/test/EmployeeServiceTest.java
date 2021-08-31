package poly.test;

import poly.service.impl.EmployeeServiceImpl;
import poly.vo.Employee;
import poly.vo.Engineer;
import poly.vo.Manager;

public class EmployeeServiceTest {

	public static void main(String[] args) {
		Employee em1 = new Employee("aaa", "�ؿ�1", "����1", 10000);
		Employee em2 = new Employee("bbb", "�ؿ�2", "����2", 20000);
		Employee em3 = new Manager("ccc", "�ؿ�3", "����3", 30000, "accout");
		Employee em4 = new Engineer("ccc", "�ؿ�4", "����4", 40000, "java", 1000);
		Employee[] emps = { em1, em2, em3, em4 };

		EmployeeServiceImpl service = EmployeeServiceImpl.getInstance();

		//1�� �޼ҵ�
		System.out.println(service.printInfo(em1));
		
		//2�� �޼ҵ�
		for (Employee e : service.printAllInfo(emps)) {
			System.out.println(e);
		}
		
		//3�� �޼ҵ�
		
		
		

	}//main

}
