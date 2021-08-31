package com.encore.service;

import com.encore.child.Engineer;
import com.encore.parent.Employee;

/*
 * step1..'C'RUD
 * public void insertManager(Manager m){}
 * public void addEngineer(Engineer dg){}
 * public void creatSecretary(Sec....s){} .. 12개의 메소드 정의
 * 
 * step2.. 
 * public void insertManager(Manager m){}
 * public void insertEngineer(Engineer dg){}
 * public void insertSecretary(Sec....s){}
 * 
 * step3..polymorphism적용X..Method Overloading
 * public void insertEmployee(Manager m){}
 * public void insertEmployee(Engineer dg){}
 * public void insertEmployee(Sec....s){}
 * 
 * step4..polymorphism적용O
 * public void insertEmployee(Employee e){
 * 	if(e instanceof){}
 * }
 */

/*
 * 상속관계에 있는 다양한 subclass들을 핸들링 하는 기능만으로 구성된 서비스 class
 */

public class EmployeeService {
	/*
	 * step1
	 * public void manageManager(Manager m){}
	 * public void manageEngineer(Engineer eg){}
	 * public void manageSeceretary(Secretary s){}
	 * 
	 * step2---Overloading
	 * "메소드 이름은 같고 처리하는 데이터를 달리하는 기법"
	 * <<Rule>>
	 * 0. 하나의 클래스에서만 적용되는 기법.
	 * 1. 메소드 이름은 반드시 같아야 한다.
	 * 2. 메소드 인자값은 반드시 달라야 한다.
	 * 3. 메소드 리턴타입은 상관없다.
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
			System.out.println("연봉 " + (e.getSalary()*12+((Engineer)e).getBonus()) );
		}
	}// manageEmployee()
	
	public void printAllEmployee(Employee[] emps) {
		for(Employee e: emps) {
			System.out.println(e.getDetails());
		}
	}
	
}



























