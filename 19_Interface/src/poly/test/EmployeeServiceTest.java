package poly.test;

import poly.service.impl.EmployeeServiceImpl;
import poly.vo.Employee;
import poly.vo.Engineer;
import poly.vo.Manager;

public class EmployeeServiceTest {

	public static void main(String[] args) {
		Employee em1 = new Employee("aaa", "준영1", "오산1", 10000);
		Employee em2 = new Employee("bbb", "준영2", "오산2", 20000);
		Employee em3 = new Manager("ccc", "준영3", "오산3", 30000, "accout");
		Employee em4 = new Engineer("ccc", "준영4", "오산4", 40000, "java", 1000);
		Employee[] emps = { em1, em2, em3, em4 };

		EmployeeServiceImpl service = EmployeeServiceImpl.getInstance();

		//1번 메소드
		System.out.println(service.printInfo(em1));
		
		//2번 메소드
		for (Employee e : service.printAllInfo(emps)) {
			System.out.println(e);
		}
		
		//3번 메소드
		
		
		

	}//main

}
