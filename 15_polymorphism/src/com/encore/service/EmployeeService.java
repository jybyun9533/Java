package com.encore.service;

import com.encore.child.Engineer;
import com.encore.parent.Employee;

/*
 * step1..'C'RUD
 * public void insertManager(Manager m){}
 * public void addEngineer(Engineer dg){}
 * public void creatSecretary(Sec....s){} .. 12���� �޼ҵ� ����
 * 
 * step2.. 
 * public void insertManager(Manager m){}
 * public void insertEngineer(Engineer dg){}
 * public void insertSecretary(Sec....s){}
 * 
 * step3..polymorphism����X..Method Overloading
 * public void insertEmployee(Manager m){}
 * public void insertEmployee(Engineer dg){}
 * public void insertEmployee(Sec....s){}
 * 
 * step4..polymorphism����O
 * public void insertEmployee(Employee e){
 * 	if(e instanceof){}
 * }
 */

/*
 * ��Ӱ��迡 �ִ� �پ��� subclass���� �ڵ鸵 �ϴ� ��ɸ����� ������ ���� class
 */

public class EmployeeService {
	/*
	 * step1
	 * public void manageManager(Manager m){}
	 * public void manageEngineer(Engineer eg){}
	 * public void manageSeceretary(Secretary s){}
	 * 
	 * step2---Overloading
	 * "�޼ҵ� �̸��� ���� ó���ϴ� �����͸� �޸��ϴ� ���"
	 * <<Rule>>
	 * 0. �ϳ��� Ŭ���������� ����Ǵ� ���.
	 * 1. �޼ҵ� �̸��� �ݵ�� ���ƾ� �Ѵ�.
	 * 2. �޼ҵ� ���ڰ��� �ݵ�� �޶�� �Ѵ�.
	 * 3. �޼ҵ� ����Ÿ���� �������.
	 * public void manageEmploayee(Manager m){}
	 * public void manageEmploayee(Engineer eg){}
	 * public void manageEmploayee(Secretary s){}
	 * 
	 * step3
	 * public void manageEmployee(Employee e){}
	 */

	public void manageEmployee(Employee e) {
		if(e.getName().equals("Peter")) {
			System.out.println(e.getDetails());
		}
		if(e instanceof Engineer) {
			System.out.println("���� " + (e.getSalary()*12+((Engineer)e).getBonus()) );
		}
	}// manageEmployee()
	
	public void printAllEmployee(Employee[] emps) {
		for(Employee e: emps) {
			System.out.println(e.getDetails());
		}
	}
	
}



























